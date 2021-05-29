package com.example.pet.clinic.bootstrap;

import com.example.pet.clinic.model.Owner;
import com.example.pet.clinic.model.Vet;
import com.example.pet.clinic.service.map.OwnerServiceMap;
import com.example.pet.clinic.service.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerServiceMap ownerServiceMap;
    private final VetServiceMap vetServiceMap;

    public DataLoader()
    {
        ownerServiceMap = new OwnerServiceMap();
        vetServiceMap = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1,owner2;

        owner1 = new Owner();
        owner1.setFirstName("john");
        owner1.setFirstName("dalton");
        owner1.setId(1L);
        ownerServiceMap.save(owner1);


        owner2 = new Owner();
        owner2.setFirstName("mike");
        owner2.setFirstName("hamil");
        owner2.setId(2L);
        ownerServiceMap.save(owner2);

        System.out.println("Loaded owners ");
        Vet vet1,vet2;


        vet1 = new Vet();
        vet1.setFirstName("lora");
        vet1.setFirstName("carry");
        vet1.setId(1L);
        vetServiceMap.save(vet1);

        vet2 = new Vet();
        vet2.setFirstName("ramin");
        vet2.setFirstName("rowshan");
        vet2.setId(2L);
        vetServiceMap.save(vet2);

        System.out.println("loaded vets");






    }
}
