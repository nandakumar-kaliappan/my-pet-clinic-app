package com.knkweb.mypetclinicapp.services.map;

import com.knkweb.mypetclinicapp.model.Visit;
import com.knkweb.mypetclinicapp.services.VisitSerive;

import java.util.Set;

public class VisitMapService extends AbstractMapService<Visit, Long> implements VisitSerive {
    @Override
    public Visit findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public Visit save(Visit object) {
        if(object.getPet() == null || object.getPet().getOwner() == null ||
                object.getPet().getId() == null || object.getPet().getOwner().getId() == null ){
            throw new RuntimeException();
        }
        return super.save(object);
    }

    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Visit object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        super.deleteById(aLong);
    }
}
