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
    CellleaderRepository genericRepository;


    @Override
    public CellLeader saveInstance(CellLeader instance) {
        return null;
    }

    @Override
    public List<CellLeader> listallInstances() {
        return null;
    }

    @Override
    public String removeInstance(Long Id) {
        return null;
    }

    @Override
    public CellLeader updateInstance(CellLeader instance) {
        return null;
    }
}
