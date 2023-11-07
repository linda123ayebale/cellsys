package com.cell.cellsys.services;

import com.cell.cellsys.models.usermodels.CellLeader;

import java.util.List;

public interface CellLeaderService{
    //Save
    CellLeader saveCellLeader(CellLeader cellLeader);
    //LIST
    List<CellLeader> listallCellleaders();
    //REMOVE
    String removeCellLeader(Long Id);
    //UPDATE
    CellLeader updateCellleader(CellLeader cellLeader);
    //GETBYID
}
