package com.cell.cellsys.services.serviceImpl;

import com.cell.cellsys.models.User;
import com.cell.cellsys.models.usermodels.CellLeader;
import com.cell.cellsys.repositories.UserRepository;
import com.cell.cellsys.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserImpl implements UserService {

    @Autowired
    UserRepository userRepository;



    @Override
    public User saveUser(User user) {
        return userRepository.save(user) ;
    }

    @Override
    public List<User> listallUsers() {
        return userRepository.findAll(Sort.by(Sort.Direction.ASC));
    }

    @Override
    public String removeUser(Long Id) {
        var check = userRepository.findById(Id);
        if(check.isPresent()) {
            userRepository.deleteById(Id);
        }else{
            return "Cell leader doesnot exist";
        }
        return"Cellleader deleted successfully";
    }



    @Override
    public User updateUser(User user) {
        return null;
    }
}
