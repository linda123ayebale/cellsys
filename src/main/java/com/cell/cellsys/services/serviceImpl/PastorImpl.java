package com.cell.cellsys.services.serviceImpl;

import com.cell.cellsys.models.usermodels.CellLeader;
import com.cell.cellsys.models.usermodels.FamilyLeader;
import com.cell.cellsys.models.usermodels.Pastor;
import com.cell.cellsys.repositories.FamilyLeaderRepository;
import com.cell.cellsys.repositories.PastorRepository;
import com.cell.cellsys.services.PastorService;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PastorImpl  implements PastorService {
    PastorRepository pastorRepository;



    @Override
    public Pastor savePastor(Pastor pastor) {
        return pastorRepository.save(pastor);
    }

    @Override
    public List<Pastor> listallpastors() {
        return  pastorRepository.findAll(Sort.by(Sort.Direction.ASC));
    }

    @Override
    public String removePastor(Long Id) {
        var check = pastorRepository.findById(Id);
        if(check.isPresent()) {
            pastorRepository.deleteById(Id);
        }else{
            return "Family leader doesnot exist";
        }
        return"Family leader deleted successfully";

    }

    @Override
    public Pastor updatePastor(Pastor pastor) {
        return null;
    }
}

