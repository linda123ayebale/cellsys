package com.cell.cellsys.contollers;

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
        return ResponseEntity.ok(pastorService.savePastor(pastor));
    }

    @GetMapping("/Listofpastors")
    public ResponseEntity<List<Pastor>> listall(){
        return ResponseEntity.ok(pastorService.listallpastors());
    }

    @DeleteMapping("/pastor/{Id}")
    public ResponseEntity<String> remove(@PathVariable Long Id){
        ResponseEntity.ok(pastorService.removePastor(Id) );
        return ResponseEntity.ok("Pastor  has been removed successfully");
    }
}

