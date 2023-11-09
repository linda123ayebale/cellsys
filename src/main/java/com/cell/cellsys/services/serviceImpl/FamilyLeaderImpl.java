package com.cell.cellsys.services.serviceImpl;

import com.cell.cellsys.models.usermodels.FamilyLeader;
import com.cell.cellsys.repositories.FamilyLeaderRepository;
import com.cell.cellsys.services.FamilyLeaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FamilyLeaderImpl implements FamilyLeaderService {

    @Autowired
    FamilyLeaderRepository familyLeaderRepository;
    @Override
    public FamilyLeader saveInstance(FamilyLeader instance) {
        return familyLeaderRepository.save(instance);
    }

    @Override
    public List<FamilyLeader> listallInstances() {
        return familyLeaderRepository.findAll();
    }

    @Override
    public void removeInstance(FamilyLeader instance) {
        familyLeaderRepository.delete(instance);
    }

    @Override
    public FamilyLeader updateInstance(FamilyLeader instance) {
        return familyLeaderRepository.saveAndFlush(instance);
    }

    @Override
    public FamilyLeader getInstanceById(Long Id) {
        return null;
    }
}
