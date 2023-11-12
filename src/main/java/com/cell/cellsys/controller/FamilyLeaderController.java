package com.cell.cellsys.controller;

import com.cell.cellsys.models.usermodels.CellLeader;
import com.cell.cellsys.models.usermodels.FamilyLeader;
import com.cell.cellsys.services.CellLeaderService;
import com.cell.cellsys.services.FamilyLeaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/family-leader-api/v1")
public class FamilyLeaderController {


        @Autowired
        FamilyLeaderService familyLeaderService;

        @PostMapping("/saveFamily-leader")
        public ResponseEntity<FamilyLeader> save(@RequestBody FamilyLeader familyLeader){
            return ResponseEntity.ok(familyLeaderService.saveInstance(familyLeader));
        }

        @GetMapping("/Listoffamily-Leaders")
        public ResponseEntity<List<FamilyLeader>> listall(){
            return ResponseEntity.ok(familyLeaderService.listallInstances());
        }

        @DeleteMapping("/family-leader/{Id}")
        public ResponseEntity<String> remove(@PathVariable Long Id){
            familyLeaderService.removeInstance(null);
            return ResponseEntity.ok("Family leader has been removed successfully");
        }
    }

