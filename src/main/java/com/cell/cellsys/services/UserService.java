package com.cell.cellsys.services;

import com.cell.cellsys.models.User;

import java.util.List;

public interface UserService {

    //Save
    User saveInstance(User instance);

    //LIST
    List<User> listallInstances();

    //REMOVE
    void removeInstance(User instance);

    //UPDATE
    User updateInstance(User instance);

    //GETBYID
    User getInstanceById(Long Id);
}
