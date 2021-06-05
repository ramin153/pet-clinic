package com.example.pet.clinic.service.springDataJpa;

import com.example.pet.clinic.model.Pet;
import com.example.pet.clinic.repository.PetRepository;
import com.example.pet.clinic.service.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
@Profile({"springdatajpa"})
public class PetSDJService implements PetService {
    private final PetRepository petRepository;


    public PetSDJService(PetRepository petRepository) {
        this.petRepository = petRepository;

    }

    @Override
    public Pet findById(Long Id) {
        Optional<Pet> pet = petRepository.findById(Id);
        return pet.orElse(null);
    }

    @Override
    public Pet save(Pet object) {
        return petRepository.save(object);
    }

    @Override
    public Set<Pet> findAll() {
        Set<Pet> pets = new HashSet<>();
        petRepository.findAll().forEach(pets::add);
        return pets;
    }

    @Override
    public void deleteByItem(Pet object) {
        petRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        petRepository.deleteById(aLong);
    }
}
