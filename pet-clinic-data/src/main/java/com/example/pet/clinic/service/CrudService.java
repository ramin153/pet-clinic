package com.example.pet.clinic.service;



import java.util.Set;

public interface CrudService<T,ID>{
    T findById(ID  Id);

    T save(T object);

    Set<T> findAll();

    void deleteByItem(T object);

    void deleteById(ID id);


}
