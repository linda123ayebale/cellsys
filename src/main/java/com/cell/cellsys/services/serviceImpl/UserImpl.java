package com.cell.cellsys.services.serviceImpl;

import com.cell.cellsys.models.User;

import com.cell.cellsys.models.usermodels.CellLeader;
import com.cell.cellsys.repositories.UserRepository;
import com.cell.cellsys.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import com.cell.cellsys.repositories.UserRepository;
import com.cell.cellsys.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User saveInstance(User instance) {
        return userRepository.save(instance);
    }

    @Override
    public List<User> listallInstances() {
        return userRepository.findAll();
    }

    @Override
    public void removeInstance(User instance) {
        userRepository.delete(instance);
    }

    @Override
    public User updateInstance(User instance) {
        return userRepository.saveAndFlush(instance);
    }

    @Override
    public User getInstanceById(Long Id) {

        return null;
    }
}
