package com.knkweb.mypetclinicapp.services.map;

import com.knkweb.mypetclinicapp.model.Vet;
import com.knkweb.mypetclinicapp.services.CrudService;
import org.springframework.stereotype.Service;
import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {

    @Override
    public Vet findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        super.deleteById(aLong);
    }
}
