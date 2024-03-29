package com.example.pet.clinic.service.springDataJpa;

import com.example.pet.clinic.model.Vet;
import com.example.pet.clinic.repository.VetRepository;
import com.example.pet.clinic.service.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
@Profile({"springdatajpa"})
public class VetSDJService implements VetService {

    private final VetRepository vetRepository;

    public VetSDJService(VetRepository vetRepository) {
        this.vetRepository = vetRepository;
    }

    @Override
    public Vet findById(Long Id) {
        Optional<Vet> vet = vetRepository.findById(Id);
        return vet.orElse(null);
    }

    @Override
    public Vet save(Vet object) {
        return vetRepository.save(object);
    }

    @Override
    public Set<Vet> findAll() {
        Set<Vet> vets = new HashSet<>();
        vetRepository.findAll().forEach(vets::add);
        return vets;
    }

    @Override
    public void deleteByItem(Vet object) {
        vetRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        vetRepository.deleteById(aLong);
    }
}
