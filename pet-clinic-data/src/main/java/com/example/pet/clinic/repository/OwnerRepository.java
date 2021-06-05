package com.example.pet.clinic.repository;

import com.example.pet.clinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner,Long> {
}
