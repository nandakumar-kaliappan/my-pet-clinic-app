package com.knkweb.mypetclinicapp.services;

import com.knkweb.mypetclinicapp.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner,Long>{
    Owner findByLastName(String lastName);
}
