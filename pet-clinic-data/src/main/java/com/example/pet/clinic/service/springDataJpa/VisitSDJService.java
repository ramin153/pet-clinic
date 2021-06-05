package com.example.pet.clinic.service.springDataJpa;

import com.example.pet.clinic.model.Visit;
import com.example.pet.clinic.repository.VisitRepository;
import com.example.pet.clinic.service.VisitService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
@Profile({"springdatajpa"})
public class VisitSDJService implements VisitService {

    private final VisitRepository visitRepository;

    public VisitSDJService(VisitRepository visitRepository) {
        this.visitRepository = visitRepository;
    }

    @Override
    public Visit findById(Long Id) {
        Optional<Visit> visit = visitRepository.findById(Id);
        return visit.orElse(null);
    }

    @Override
    public Visit save(Visit object) {
        return visitRepository.save(object);
    }

    @Override
    public Set<Visit> findAll() {
        Set<Visit> visits = new HashSet<>();
        visitRepository.findAll().forEach(visits::add);

        return visits ;
    }

    @Override
    public void deleteByItem(Visit object) {
        visitRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        visitRepository.deleteById(aLong);
    }
}
