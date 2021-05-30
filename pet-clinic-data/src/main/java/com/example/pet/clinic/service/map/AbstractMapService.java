package com.example.pet.clinic.service.map;

import com.example.pet.clinic.model.BaseEntity;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity,ID extends  Long> {

    protected Map<Long,T> map = new HashMap<>();

    T findById(ID  id)
    {
        return map.get(id);
    }

    T save(T object) throws RuntimeException
    {
        if (object != null)
        {

            if (object.getId() == null)
                object.setId(nextId());

            map.put(object.getId(), object);
            return object;
        }
        throw new RuntimeException("you pass null object");

    }

    Set<T> findAll()
    {
        return new HashSet<>(map.values());
    }

    void deleteByItem(T object)
    {
        map.entrySet().removeIf(item -> item.getValue().equals(object) );
    }

    void deleteById(ID id)
    {
        map.remove(id);
    }

    private long nextId()
    {
        long nextId = 1;
        try {
            nextId = Collections.max(map.keySet()) +1;
        }catch (Exception ignored)
        {

        }

        return nextId;

    }

}
