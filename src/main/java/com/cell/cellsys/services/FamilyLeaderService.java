package com.cell.cellsys.services;

import com.cell.cellsys.models.usermodels.CellLeader;
import com.cell.cellsys.models.usermodels.FamilyLeader;

import java.util.List;

public interface FamilyLeaderService {

    FamilyLeader saveFamily(FamilyLeader familyLeader);
    //LIST
    List<FamilyLeader> lisatallFamilyLeaders();
    //REMOVE
    String removeFamilyLeader(Long Id);
    //UPDATE
    CellLeader updateFamilyLeader(FamilyLeader familyLeader);
}
