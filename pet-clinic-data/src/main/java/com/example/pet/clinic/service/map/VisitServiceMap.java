package com.example.pet.clinic.service.map;

import com.example.pet.clinic.model.Visit;
import com.example.pet.clinic.service.VisitService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class VisitServiceMap extends AbstractMapService<Visit,Long> implements VisitService{


    @Override
    public Visit findById(Long Id) {
        return super.findById(Id);
    }

    @Override
    public Visit save(Visit object) {
        if (object.getPet() == null || object.getPet().getId() == null || object.getPet().getOwner() == null)
            throw new RuntimeException("the pet of visit is invalid");
        return super.save(object);
    }

    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void deleteByItem(Visit object) {
        super.deleteByItem(object);
    }
}
