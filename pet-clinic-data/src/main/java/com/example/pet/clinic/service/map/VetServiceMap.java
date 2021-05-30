package com.example.pet.clinic.service.map;


import com.example.pet.clinic.model.Vet;
import com.example.pet.clinic.service.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet,Long> implements VetService {
    @Override
    public Vet findById(Long Id) {
        return super.findById(Id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object);
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void deleteByItem(Vet object) {
        super.deleteByItem(object);
    }
}
