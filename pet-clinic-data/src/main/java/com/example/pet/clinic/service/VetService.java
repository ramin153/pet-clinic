package com.example.pet.clinic.service;


import com.example.pet.clinic.model.Vet;

import java.util.Set;

public interface VetService {


    public Vet findById(Long  Id);

    public Vet save(Vet vet);

    public Set<Vet> findAll();

}
