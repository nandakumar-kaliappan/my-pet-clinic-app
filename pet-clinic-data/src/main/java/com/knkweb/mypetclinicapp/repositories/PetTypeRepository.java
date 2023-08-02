package com.knkweb.mypetclinicapp.repositories;

import com.knkweb.mypetclinicapp.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
