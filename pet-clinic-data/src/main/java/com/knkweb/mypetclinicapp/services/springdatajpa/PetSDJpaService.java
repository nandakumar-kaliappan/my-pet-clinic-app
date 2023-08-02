package com.knkweb.mypetclinicapp.services.springdatajpa;

import com.knkweb.mypetclinicapp.model.Pet;
import com.knkweb.mypetclinicapp.repositories.OwnerRepository;
import com.knkweb.mypetclinicapp.repositories.PetRepository;
import com.knkweb.mypetclinicapp.repositories.VetRepository;
import com.knkweb.mypetclinicapp.services.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("sdjpa")
public class PetSDJpaService implements PetService {
    private final OwnerRepository ownerRepository;
    private final PetRepository petRepository;
    private  final VetRepository vetRepository;

    public PetSDJpaService(OwnerRepository ownerRepository, PetRepository petRepository,
                           VetRepository vetRepository) {
        this.ownerRepository = ownerRepository;
        this.petRepository = petRepository;
        this.vetRepository = vetRepository;
    }

    @Override
    public Pet findById(Long aLong) {
        return petRepository.findById(aLong).orElse(null);
    }

    @Override
    public Pet save(Pet object) {
        return petRepository.save(object);
    }

    @Override
    public Set<Pet> findAll() {
        Set<Pet> pets = new HashSet<>();
        petRepository.findAll().forEach(pets::add);
        return pets;
    }

    @Override
    public void delete(Pet object) {
        petRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        petRepository.deleteById(aLong);
    }
}

