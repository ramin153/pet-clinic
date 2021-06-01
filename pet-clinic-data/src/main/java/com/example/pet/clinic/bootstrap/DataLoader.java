package com.example.pet.clinic.bootstrap;

import com.example.pet.clinic.model.Owner;
import com.example.pet.clinic.model.Pet;
import com.example.pet.clinic.model.PetType;
import com.example.pet.clinic.model.Vet;
import com.example.pet.clinic.service.map.OwnerServiceMap;
import com.example.pet.clinic.service.map.PetTypeServiceMap;
import com.example.pet.clinic.service.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerServiceMap ownerServiceMap;
    private final VetServiceMap vetServiceMap;
    private final PetTypeServiceMap petTypeServiceMap;

    public DataLoader(OwnerServiceMap ownerServiceMap, VetServiceMap vetServiceMap, PetTypeServiceMap petTypeServiceMap) {
        this.ownerServiceMap = ownerServiceMap;
        this.vetServiceMap = vetServiceMap;
        this.petTypeServiceMap = petTypeServiceMap;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog ,cat;

        dog = new PetType();
        dog.setName("dog");
        PetType dogSaveType = petTypeServiceMap.save(dog);

        cat = new PetType();
        cat.setName("cat");
        PetType catSaveType = petTypeServiceMap.save(cat);

        Pet owner1Pet,owner2Pet;

        owner1Pet = new Pet();
        owner1Pet.setName("sag");
        owner1Pet.setPetType(dog);
        owner1Pet.setBirthDate(LocalDate.now());

        owner2Pet = new Pet();
        owner2Pet.setName("gorbeh");
        owner2Pet.setPetType(cat);
        owner2Pet.setBirthDate(LocalDate.now());

        Owner owner1,owner2;


        owner1 = new Owner();
        owner1.setFirstName("john");
        owner1.setLastName("dalton");
        owner1.setAddress("street 6");
        owner1.setCity("shiraz");
        owner1.setTelephone("099999999");
        owner1Pet.setOwner(owner1);
        owner1.getPets().add(owner1Pet);
        ownerServiceMap.save(owner1);

        owner2 = new Owner();
        owner2.setFirstName("mike");
        owner2.setLastName("hamil");
        owner2.setAddress("avenue 5");
        owner2.setCity("tabriz");
        owner2.setTelephone("098888888");
        owner2Pet.setOwner(owner2);
        owner2.getPets().add(owner2Pet);
        ownerServiceMap.save(owner2);

        System.out.println("Loaded owners ");
        Vet vet1,vet2;


        vet1 = new Vet();
        vet1.setFirstName("lora");
        vet1.setLastName("carry");

        vetServiceMap.save(vet1);

        vet2 = new Vet();
        vet2.setFirstName("ramin");
        vet2.setLastName("rowshan");

        vetServiceMap.save(vet2);

        System.out.println("loaded vets");

    }
}

/**
 *
 * package com.example.pet.clinic.bootstrap;
 *
 * import com.example.pet.clinic.model.Owner;
 * import com.example.pet.clinic.model.Vet;
 * import com.example.pet.clinic.service.map.OwnerServiceMap;
 * import com.example.pet.clinic.service.map.VetServiceMap;
 * import org.springframework.boot.CommandLineRunner;
 * import org.springframework.stereotype.Component;
 *
 * @Component
 * public class DataLoader implements CommandLineRunner {
 *
 *     private final OwnerServiceMap ownerServiceMap;
 *     private final VetServiceMap vetServiceMap;
 *
 *     public DataLoader(OwnerServiceMap ownerServiceMap, VetServiceMap vetServiceMap) {
 *         this.ownerServiceMap = ownerServiceMap;
 *         this.vetServiceMap = vetServiceMap;
 *     }
 *
 *
 *     @Override
 *     public void run(String... args) throws Exception {
 *         Owner owner1,owner2;
 *
 *         owner1 = new Owner();
 *         owner1.setFirstName("john");
 *         owner1.setFirstName("dalton");
 *         owner1.setId(1L);
 *         ownerServiceMap.save(owner1);
 *
 *
 *         owner2 = new Owner();
 *         owner2.setFirstName("mike");
 *         owner2.setFirstName("hamil");
 *         owner2.setId(2L);
 *         ownerServiceMap.save(owner2);
 *
 *         System.out.println("Loaded owners ");
 *         Vet vet1,vet2;
 *
 *
 *         vet1 = new Vet();
 *         vet1.setFirstName("lora");
 *         vet1.setFirstName("carry");
 *         vet1.setId(1L);
 *         vetServiceMap.save(vet1);
 *
 *         vet2 = new Vet();
 *         vet2.setFirstName("ramin");
 *         vet2.setFirstName("rowshan");
 *         vet2.setId(2L);
 *         vetServiceMap.save(vet2);
 *
 *         System.out.println("loaded vets");
 *
 *
 *
 *
 *
 *
 *     }
 * }
 */
