package com.cell.cellsys.services.serviceImpl;

import com.cell.cellsys.models.usermodels.Pastor;
import com.cell.cellsys.repositories.PastorRepository;
import com.cell.cellsys.services.PastorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PastorImpl implements PastorService {

    @Autowired
    PastorRepository pastorRepository;
    @Override
    public Pastor saveInstance(Pastor instance) {
        return pastorRepository.save(instance);
    }

    @Override
    public List<Pastor> listallInstances() {
        return pastorRepository.findAll();
    }

    @Override
    public void removeInstance(Pastor instance) {
        pastorRepository.delete(instance);
    }

    @Override
    public Pastor updateInstance(Pastor instance) {
        return pastorRepository.saveAndFlush(instance);
    }

    @Override
    public Pastor getInstanceById(Long Id) {
        return null;
    }
}
