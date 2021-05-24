package com.example.pet.clinic.service;

import com.example.pet.clinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    public Owner findById(Long  Id);

    public Owner save(Owner owner);

    public Set<Owner> findAll();

    public Owner findByLastName(String lastName);


}
