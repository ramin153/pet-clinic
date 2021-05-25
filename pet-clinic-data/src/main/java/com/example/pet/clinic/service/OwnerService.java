package com.example.pet.clinic.service;

import com.example.pet.clinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner,Long> {


    public Owner findByLastName(String lastName);


}
