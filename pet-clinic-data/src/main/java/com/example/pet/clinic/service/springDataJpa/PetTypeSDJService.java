package com.example.pet.clinic.service.springDataJpa;

import com.example.pet.clinic.model.PetType;
import com.example.pet.clinic.repository.PetTypeRepository;
import com.example.pet.clinic.service.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;


@Service
@Profile({"springdatajpa"})
public class PetTypeSDJService implements PetTypeService {


    private final PetTypeRepository petTypeRepository;

    public PetTypeSDJService(PetTypeRepository petTypeRepository) {
        this.petTypeRepository = petTypeRepository;
    }


    @Override
    public PetType findById(Long Id) {
        Optional<PetType> petType = petTypeRepository.findById(Id);
        return petType.orElse(null);
    }

    @Override
    public PetType save(PetType object) {
        return petTypeRepository.save(object);
    }

    @Override
    public Set<PetType> findAll() {

        Set<PetType> petTypes = new HashSet<>();
        petTypeRepository.findAll().forEach(petTypes::add);
        return petTypes;
    }

    @Override
    public void deleteByItem(PetType object) {
        petTypeRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        petTypeRepository.deleteById(aLong);
    }
}
