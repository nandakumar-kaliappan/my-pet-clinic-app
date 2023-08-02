package com.knkweb.mypetclinicapp.repositories;

import com.knkweb.mypetclinicapp.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
    Owner findByLastName(String lastName);
}
