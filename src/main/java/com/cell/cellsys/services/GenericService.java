package com.cell.cellsys.services;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

public interface GenericService<T> {

    //Save
    T saveInstance(T instance);
    //LIST
    List<T> listallInstances();
    //REMOVE
    String removeInstance(Long Id);
    //UPDATE
    T updateInstance(T instance);
    //GETBYID
}
