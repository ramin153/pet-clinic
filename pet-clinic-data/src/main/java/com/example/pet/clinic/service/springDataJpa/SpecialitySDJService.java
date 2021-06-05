package com.example.pet.clinic.service.springDataJpa;

import com.example.pet.clinic.model.Speciality;
import com.example.pet.clinic.repository.SpecialityRepository;
import com.example.pet.clinic.service.SpecialitiesService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
@Profile({"springdatajpa"})
public class SpecialitySDJService implements SpecialitiesService {

    private final SpecialityRepository specialityRepository;

    public SpecialitySDJService(SpecialityRepository specialityRepository) {
        this.specialityRepository = specialityRepository;
    }


    @Override
    public Speciality findById(Long Id) {
        Optional<Speciality> speciality = specialityRepository.findById(Id);

        return speciality.orElse(null);
    }

    @Override
    public Speciality save(Speciality object) {
        return specialityRepository.save(object);
    }

    @Override
    public Set<Speciality> findAll() {
        Set<Speciality> specialities = new HashSet<>();
        specialityRepository.findAll().forEach(specialities::add);
        return specialities;
    }

    @Override
    public void deleteByItem(Speciality object) {
        specialityRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        specialityRepository.deleteById(aLong);
    }
}
