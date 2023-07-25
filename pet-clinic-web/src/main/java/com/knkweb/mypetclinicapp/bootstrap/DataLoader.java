package com.knkweb.mypetclinicapp.bootstrap;

import com.knkweb.mypetclinicapp.model.Owner;
import com.knkweb.mypetclinicapp.model.Vet;
import com.knkweb.mypetclinicapp.services.OwnerService;
import com.knkweb.mypetclinicapp.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Ram");
        owner1.setLastName("kumar");
        ownerService.save(owner1);
        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Arav");
        owner2.setLastName("sha");
        ownerService.save(owner2);

        System.out.println("Owners loaded");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Durai");
        vet1.setLastName("ravi");
        vetService.save(vet1);
        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Sam");
        vet2.setLastName("vo");
        vetService.save(vet2);
        System.out.println("Vets loaded");

    }


}
