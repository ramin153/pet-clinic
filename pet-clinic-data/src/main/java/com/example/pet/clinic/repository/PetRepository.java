package com.example.pet.clinic.repository;


import com.example.pet.clinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet,Long> {
}
