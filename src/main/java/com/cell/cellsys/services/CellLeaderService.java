package com.cell.cellsys.services;

import com.cell.cellsys.models.usermodels.CellLeader;

import java.util.List;

public interface CellLeaderService{
    //Save
    CellLeader saveInstance(CellLeader instance);
    //LIST
    List<CellLeader> listallInstances();
    //REMOVE
    String removeInstance(Long Id);
    //UPDATE
    CellLeader updateInstance(CellLeader instance);
    //GETBYID
}
