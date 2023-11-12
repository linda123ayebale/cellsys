package com.cell.cellsys.controller;

import com.cell.cellsys.models.User;
import com.cell.cellsys.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user-api/v1")
public class UserController {

    @Autowired UserService userService;

        @PostMapping("/saveUser")
        public ResponseEntity<User> save(@RequestBody User user){
            return ResponseEntity.ok(userService.saveInstance(user));
        }

        @GetMapping("/Listofusers")
        public ResponseEntity<List<User>> listall(){
            return ResponseEntity.ok(userService.listallInstances());
        }

        @DeleteMapping("/user/{Id}")
        public ResponseEntity<String> remove(@PathVariable Long Id){
           userService.removeInstance(null);
            return ResponseEntity.ok("User  has been removed successfully");
        }
    }

