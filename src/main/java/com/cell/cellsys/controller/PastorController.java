package com.cell.cellsys.controller;

import com.cell.cellsys.models.User;
import com.cell.cellsys.models.usermodels.Pastor;
import com.cell.cellsys.services.PastorService;
import com.cell.cellsys.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pastor-api/v1")
public class PastorController {

    @Autowired
    PastorService pastorService;

    @Autowired
    UserService userService;

    @PostMapping("/savePastor")
    public ResponseEntity<Pastor> save(@RequestBody User user){
        Pastor pastor = new Pastor();
        pastor.setUser(userService.saveInstance(user));
        return ResponseEntity.ok(pastorService.saveInstance(pastor));
    }

    @GetMapping("/Listofpastors")
    public ResponseEntity<List<Pastor>> listall(){
        return ResponseEntity.ok(pastorService.listallInstances());
    }

    @DeleteMapping("/pastor/{Id}")
    public ResponseEntity<String> remove(@PathVariable Long Id){
        pastorService.removeInstance(pastorService.getInstanceById(Id));
        return ResponseEntity.ok("Pastor  has been removed successfully");
    }
}

