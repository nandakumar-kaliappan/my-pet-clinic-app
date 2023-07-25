package com.knkweb.mypetclinicapp.services.map;

import com.knkweb.mypetclinicapp.model.BaseEntity;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapService<T extends BaseEntity,ID extends Long>{
    protected Map<Long,T>  map= new HashMap<>();

    public T findById(ID id){
        return map.get(id);
    }
    public T save(T object){
        setId(object,map.size()+1L);
        map.put(object.getId(), object);
        return object;
    }

    private void setId(T object, long l) {
        if(object.getId() == null)
            object.setId(l);
    }


    public Set<T> findAll(){
        return new HashSet<>(map.values());
    }
    public void delete(T object){
        map.entrySet().removeIf(e -> e.getValue().equals(object));
    }
    public void deleteById(ID id){
        map.remove(id);
    }
}
