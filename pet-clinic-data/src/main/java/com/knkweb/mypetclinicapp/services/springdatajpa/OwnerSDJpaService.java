package com.knkweb.mypetclinicapp.services.springdatajpa;

import com.knkweb.mypetclinicapp.model.Owner;
import com.knkweb.mypetclinicapp.repositories.OwnerRepository;
import com.knkweb.mypetclinicapp.repositories.PetRepository;
import com.knkweb.mypetclinicapp.repositories.VetRepository;
import com.knkweb.mypetclinicapp.services.OwnerService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("sdjpa")
public class OwnerSDJpaService implements OwnerService {
    private final OwnerRepository ownerRepository;
    private final PetRepository petRepository;
    private  final VetRepository vetRepository;

    public OwnerSDJpaService(OwnerRepository ownerRepository, PetRepository petRepository,
                             VetRepository vetRepository){
        this.ownerRepository = ownerRepository;
        this.petRepository = petRepository;
        this.vetRepository = vetRepository;
    }

    @Override
    public Owner findByLastName(String lastName) {
        return ownerRepository.findByLastName(lastName);
    }

    @Override
    public Owner findById(Long aLong) {
        return ownerRepository.findById(aLong).orElse(null);
    }

    @Override
    public Owner save(Owner object) {
        return ownerRepository.save(object);
    }

    @Override
    public Set<Owner> findAll() {

        Set<Owner> owners = new HashSet<>();
        ownerRepository.findAll().forEach(owners::add);
        return owners;
    }

    @Override
    public void delete(Owner object) {
        ownerRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        ownerRepository.deleteById(aLong);
    }
}
