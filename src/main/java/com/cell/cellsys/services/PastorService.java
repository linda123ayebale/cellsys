package com.cell.cellsys.services;

import com.cell.cellsys.models.usermodels.CellLeader;

import com.cell.cellsys.models.usermodels.FamilyLeader;

import com.cell.cellsys.models.usermodels.Pastor;

import java.util.List;


public interface PastorService {
    //Save
    Pastor saveInstance(Pastor instance);
    //LIST
    List<Pastor> listallInstances();
    //REMOVE
    void removeInstance(Pastor instance);
    //UPDATE
    Pastor updateInstance(Pastor instance);
    //GETBYID
    Pastor getInstanceById(Long Id);

}
