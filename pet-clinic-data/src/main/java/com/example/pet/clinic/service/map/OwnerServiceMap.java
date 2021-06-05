package com.example.pet.clinic.service.map;

import com.example.pet.clinic.model.Owner;
import com.example.pet.clinic.model.Pet;
import com.example.pet.clinic.service.OwnerService;
import com.example.pet.clinic.service.PetService;
import com.example.pet.clinic.service.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default","map"})
public class OwnerServiceMap extends AbstractMapService<Owner,Long> implements OwnerService {
    private final PetService petService;
    private final PetTypeService petTypeService;

    public OwnerServiceMap(PetService petService, PetTypeService petTypeService) {
        this.petService = petService;
        this.petTypeService = petTypeService;
    }

    @Override
    public Owner findById(Long Id) {
        return super.findById(Id);
    }

    @Override
    public Owner save(Owner object)
    {
        if (object != null)
        {
            object.getPets().forEach(pet -> {
                if(pet.getPetType() != null)
                {
                    if (pet.getPetType().getId() == null)
                    {
                        pet.setPetType(petTypeService.save(pet.getPetType()));
                    }
                }else
                {
                    throw new RuntimeException("the pet doesn't have any type");
                }

                if (pet.getId() == null)
                {
                    Pet savePet = petService.save(pet);
                    pet.setId(savePet.getId());
                }
            });
            super.save(object);
        }


        return null;
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void deleteByItem(Owner object) {
        super.deleteByItem(object);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
