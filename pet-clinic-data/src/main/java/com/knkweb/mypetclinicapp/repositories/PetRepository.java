package com.knkweb.mypetclinicapp.repositories;

import com.knkweb.mypetclinicapp.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
