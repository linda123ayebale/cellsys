package com.cell.cellsys.controller;

import com.cell.cellsys.models.usermodels.FamilyLeader;
import com.cell.cellsys.models.usermodels.Pastor;
import com.cell.cellsys.services.FamilyLeaderService;
import com.cell.cellsys.services.PastorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pastor-api/v1")
public class PastorController {

    @Autowired
    PastorService pastorService;

    @PostMapping("/savePastor")
    public ResponseEntity<Pastor> save(@RequestBody Pastor pastor){
        return ResponseEntity.ok(pastorService.saveInstance(pastor));
    }

    @GetMapping("/Listofpastors")
    public ResponseEntity<List<Pastor>> listall(){
        return ResponseEntity.ok(pastorService.listallInstances());
    }

    @DeleteMapping("/pastor/{Id}")
    public ResponseEntity<String> remove(@PathVariable Long Id){
        ResponseEntity.ok(pastorService.saveInstance(null) );
        return ResponseEntity.ok("Pastor  has been removed successfully");
    }
}

