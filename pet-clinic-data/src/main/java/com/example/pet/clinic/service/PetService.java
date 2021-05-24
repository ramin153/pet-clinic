package com.example.pet.clinic.service;



import com.example.pet.clinic.model.Pet;

import java.util.Set;

public interface PetService {

    public Pet findById(Long  Id);

    public Pet save(Pet pet);

    public Set<Pet> findAll();

}
