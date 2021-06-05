package com.example.pet.clinic.service.springDataJpa;

import com.example.pet.clinic.model.Owner;
import com.example.pet.clinic.repository.OwnerRepository;
import com.example.pet.clinic.service.OwnerService;
import com.example.pet.clinic.service.PetService;
import com.example.pet.clinic.service.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
@Profile({"springdatajpa"})
public class OwnerSDJService implements OwnerService {

    private final PetService petService;
    private final PetTypeService petTypeService;
    protected final OwnerRepository ownerRepository;

    public OwnerSDJService(PetService petService, PetTypeService petTypeService, OwnerRepository ownerRepository) {
        this.petService = petService;
        this.petTypeService = petTypeService;
        this.ownerRepository = ownerRepository;
    }

    @Override
    public Owner findById(Long Id) {
        Optional<Owner> owner = ownerRepository.findById(Id);
        return owner.orElse(null);
    }

    @Override
    public Owner save(Owner object) {


        return ownerRepository.save(object);
    }

    @Override
    public Set<Owner> findAll() {
        Set<Owner> owners = new HashSet<>();
        ownerRepository.findAll().forEach(owners::add);
        return owners;
    }

    @Override
    public void deleteByItem(Owner object) {
        ownerRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        ownerRepository.deleteById(aLong);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return ownerRepository.findByLastName(lastName);
    }
}
