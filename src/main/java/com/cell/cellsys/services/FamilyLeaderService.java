package com.cell.cellsys.services;

import com.cell.cellsys.models.usermodels.CellLeader;
import com.cell.cellsys.models.usermodels.FamilyLeader;

import java.util.List;

public interface FamilyLeaderService{

    //Save
    FamilyLeader saveInstance(FamilyLeader instance);
    //LIST
    List<FamilyLeader> listallInstances();
    //REMOVE
    void removeInstance(FamilyLeader instance);
    //UPDATE
    FamilyLeader updateInstance(FamilyLeader instance);
    //GETBYID
    FamilyLeader getInstanceById(Long Id);

}
