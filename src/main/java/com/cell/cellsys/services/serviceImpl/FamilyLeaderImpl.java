package com.cell.cellsys.services.serviceImpl;

import com.cell.cellsys.models.usermodels.CellLeader;
import com.cell.cellsys.models.usermodels.FamilyLeader;
import com.cell.cellsys.repositories.FamilyLeaderRepository;
import com.cell.cellsys.services.FamilyLeaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FamilyLeaderImpl  implements FamilyLeaderService {

    @Autowired
    FamilyLeaderRepository familyLeaderRepository;
    @Override
    public FamilyLeader saveFamily(FamilyLeader familyLeader) {
        return familyLeaderRepository.save(familyLeader);
    }

    @Override
    public List<FamilyLeader> lisatallFamilyLeaders() {
        return  familyLeaderRepository.findAll(Sort.by(Sort.Direction.ASC));
    }

    @Override
    public String removeFamilyLeader(Long Id) {
        var check = familyLeaderRepository.findById(Id);
        if(check.isPresent()) {
            familyLeaderRepository.deleteById(Id);
        }else{
            return "Family leader doesnot exist";
        }
        return"Family leader deleted successfully";

    }

    @Override
    public CellLeader updateFamilyLeader(FamilyLeader familyLeader) {
        return null;
    }
}
