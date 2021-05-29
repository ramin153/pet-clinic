package com.example.pet.clinic.service.map;

import com.example.pet.clinic.model.Owner;
import com.example.pet.clinic.service.OwnerService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner,Long> implements OwnerService {
    @Override
    public Owner findById(Long Id) {
        return super.findById(Id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(),object);
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void deleteByItem(Owner object) {
        super.deleteByItem(object);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
