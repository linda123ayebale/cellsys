package com.cell.cellsys.services.serviceImpl;

import com.cell.cellsys.repositories.GenericRepository;
import com.cell.cellsys.services.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenericImpl<T> implements GenericService<T> {

    @Autowired
    GenericRepository<T> genericRepository;
    @Override
    public T saveInstance(T instance) {
      return genericRepository.save(instance);
    }

    @Override
    public List<T> listallInstances() {
        return genericRepository.findAll();
    }

    @Override
    public String removeInstance(Long Id) {
        genericRepository.deleteById(Id);
        return "Instance removed successfully";
    }

    @Override
    public T updateInstance(T instance) {
        return genericRepository.save(instance);
    }
}
