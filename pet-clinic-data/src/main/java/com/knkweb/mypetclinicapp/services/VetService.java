package com.knkweb.mypetclinicapp.services;

import com.knkweb.mypetclinicapp.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findByID(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
