package com.knkweb.mypetclinicapp.services;

import com.knkweb.mypetclinicapp.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findByID(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
