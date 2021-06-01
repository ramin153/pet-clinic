package com.example.pet.clinic.service.map;

import com.example.pet.clinic.model.PetType;
import com.example.pet.clinic.service.PetTypeService;

import java.util.Set;

public class PetTypeServiceMap extends AbstractMapService<PetType,Long> implements PetTypeService {
    @Override
    public PetType findById(Long Id) {
        return super.findById(Id);
    }

    @Override
    public PetType save(PetType object) {
        return super.save(object);
    }

    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void deleteByItem(PetType object) {
        super.deleteByItem(object);
    }
}
