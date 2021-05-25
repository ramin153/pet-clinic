package com.example.pet.clinic.service.map;


import com.example.pet.clinic.model.Pet;
import com.example.pet.clinic.service.PetService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet,Long> implements PetService {
    @Override
    public Pet findById(Long Id) {
        return super.findById(Id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(),object);
    }

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void deleteByItem(Pet object) {
        super.deleteByItem(object);
    }
}
