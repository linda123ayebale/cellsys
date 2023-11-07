package com.cell.cellsys.services.serviceImpl;

import com.cell.cellsys.models.usermodels.CellLeader;
import com.cell.cellsys.repositories.CellleaderRepository;
import com.cell.cellsys.services.CellLeaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CellLeaderImpl implements CellLeaderService {

    @Autowired
    CellleaderRepository cellleaderRepository;


    @Override
    public CellLeader saveCellLeader(CellLeader cellLeader) {

        return cellleaderRepository.save(cellLeader) ;
    }

    @Override
    public List<CellLeader> listallCellleaders() {
        return cellleaderRepository.findAll(Sort.by(Sort.Direction.ASC));
    }

    @Override
    public String removeCellLeader(Long Id) {
        var check = cellleaderRepository.findById(Id);
        if(check.isPresent()) {
            cellleaderRepository.deleteById(Id);
        }else{
            return "Cell leader doesnot exist";
        }
        return"Cellleader deleted successfully";
    }

    @Override
    public CellLeader updateCellleader(CellLeader cellLeader) {
        return null;
    }
}
