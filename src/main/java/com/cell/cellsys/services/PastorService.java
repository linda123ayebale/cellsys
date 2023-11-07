package com.cell.cellsys.services;

import com.cell.cellsys.models.usermodels.CellLeader;
import com.cell.cellsys.models.usermodels.Pastor;

import java.util.List;

public interface PastorService{
    Pastor savePastor(Pastor pastor);
    //LIST
    List<Pastor> listallpastors();
    //REMOVE
    String removePastor(Long Id);
    //UPDATE
    Pastor updatePastor(Pastor pastor);
}
