package com.cell.cellsys.contollers;

import com.cell.cellsys.models.User;
import com.cell.cellsys.models.usermodels.Pastor;
import com.cell.cellsys.services.PastorService;
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
            return ResponseEntity.ok(userService.saveUser(user));
        }

        @GetMapping("/Listofusers")
        public ResponseEntity<List<User>> listall(){
            return ResponseEntity.ok(userService.listallUsers());
        }

        @DeleteMapping("/user/{Id}")
        public ResponseEntity<String> remove(@PathVariable Long Id){
            ResponseEntity.ok(userService.removeUser(Id) );
            return ResponseEntity.ok("User  has been removed successfully");
        }
    }

