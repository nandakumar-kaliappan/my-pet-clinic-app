package com.knkweb.mypetclinicapp.services.map;

import com.knkweb.mypetclinicapp.model.Pet;
import com.knkweb.mypetclinicapp.services.CrudService;
import com.knkweb.mypetclinicapp.services.PetService;
import org.springframework.stereotype.Service;
import java.util.Set;

@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {

    @Override
    public Pet findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object);
    }

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        super.deleteById(aLong);
    }
}
