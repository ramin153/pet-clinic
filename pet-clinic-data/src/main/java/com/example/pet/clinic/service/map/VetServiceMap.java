package com.example.pet.clinic.service.map;


import com.example.pet.clinic.model.Vet;
import com.example.pet.clinic.service.SpecialitiesService;
import com.example.pet.clinic.service.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


import java.util.Set;

@Service
@Profile({"default","map"})
public class VetServiceMap extends AbstractMapService<Vet,Long> implements VetService {
    private final SpecialitiesService SpecialityService;

    public VetServiceMap(SpecialitiesService speciality) {
        SpecialityService = speciality;
    }

    @Override
    public Vet findById(Long Id) {
        return super.findById(Id);
    }

    @Override
    public Vet save(Vet object) {
        if (object.getSpecialities().size() > 0){
            object.getSpecialities().forEach(speciality -> {
                if(speciality.getId() == null){
                    com.example.pet.clinic.model.Speciality savedSpecialty = SpecialityService.save(speciality);
                    speciality.setId(savedSpecialty.getId());
                }
            });
        }

        return super.save(object);
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void deleteByItem(Vet object) {
        super.deleteByItem(object);
    }
}
