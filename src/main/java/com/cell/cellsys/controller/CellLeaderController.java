package com.cell.cellsys.controller;

import com.cell.cellsys.models.usermodels.CellLeader;
import com.cell.cellsys.services.CellLeaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cell-leader-api/v1")
public class CellLeaderController {

    @Autowired
    CellLeaderService cellLeaderService;

    @PostMapping("/saveCell-leaders")
    public ResponseEntity<CellLeader> save(@RequestBody CellLeader cellLeader){
        return ResponseEntity.ok(cellLeaderService.saveInstance(cellLeader));
    }

    @GetMapping("/Listofcell-Leaders")
    public ResponseEntity<List<CellLeader>> listall(){
        return ResponseEntity.ok(cellLeaderService.listallInstances());
    }

    @DeleteMapping("/cell-leader/{Id}")
    public ResponseEntity<String> remove(@PathVariable Long Id){
        cellLeaderService.removeInstance(null);
        return ResponseEntity.ok("Cell leader has been removed successfully");
    }
}
