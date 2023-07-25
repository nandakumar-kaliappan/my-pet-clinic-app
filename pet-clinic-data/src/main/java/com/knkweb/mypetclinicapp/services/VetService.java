package com.knkweb.mypetclinicapp.services;

import com.knkweb.mypetclinicapp.model.Owner;
import com.knkweb.mypetclinicapp.model.Vet;

import java.util.Set;

public interface VetService extends CrudService<Vet,Long> {
    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
