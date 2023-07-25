package com.knkweb.mypetclinicapp.services.map;

import com.knkweb.mypetclinicapp.model.Owner;
import com.knkweb.mypetclinicapp.services.CrudService;
import com.knkweb.mypetclinicapp.services.OwnerService;
import org.springframework.stereotype.Service;
import java.util.Set;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

    @Override
    public Owner findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        super.deleteById(aLong);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
