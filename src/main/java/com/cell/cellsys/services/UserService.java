package com.cell.cellsys.services;

import com.cell.cellsys.models.User;
import com.cell.cellsys.models.usermodels.CellLeader;

import java.util.List;

public interface UserService {

    User saveUser(User user);
    //LIST
    List<User> listallUsers();
    //REMOVE
    String removeUser(Long Id);
    //UPDATE
    User updateUser(User user);
}
