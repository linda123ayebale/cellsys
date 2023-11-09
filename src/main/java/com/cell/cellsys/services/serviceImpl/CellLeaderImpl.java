package com.cell.cellsys.services.serviceImpl;

import com.cell.cellsys.models.usermodels.CellLeader;
import com.cell.cellsys.repositories.CellleaderRepository;
import com.cell.cellsys.services.CellLeaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CellLeaderImpl implements CellLeaderService {

    @Autowired
    CellleaderRepository cellleaderRepository;


    @Override
    public CellLeader saveInstance(CellLeader instance) {
        return cellleaderRepository.save(instance);
    }

    @Override
    public List<CellLeader> listallInstances() {
        return cellleaderRepository.findAll();
    }

    @Override
    public void removeInstance(CellLeader instance) {
        cellleaderRepository.delete(instance);
    }

    @Override
    public CellLeader updateInstance(CellLeader instance) {
        return cellleaderRepository.saveAndFlush(instance);
    }
}
