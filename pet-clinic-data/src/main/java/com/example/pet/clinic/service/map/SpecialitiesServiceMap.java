package com.example.pet.clinic.service.map;

import com.example.pet.clinic.model.Speciality;
import com.example.pet.clinic.service.SpecialitiesService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class SpecialitiesServiceMap extends AbstractMapService<Speciality,Long> implements SpecialitiesService {
    @Override
    public Speciality findById(Long Id) {
        return super.findById(Id);
    }

    @Override
    public Speciality save(Speciality object) {
        return super.save(object);
    }

    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void deleteByItem(Speciality object) {
        super.deleteByItem(object);
    }
}
