package com.knkweb.mypetclinicapp.bootstrap;

import com.knkweb.mypetclinicapp.model.*;
import com.knkweb.mypetclinicapp.services.OwnerService;
import com.knkweb.mypetclinicapp.services.PetTypeService;
import com.knkweb.mypetclinicapp.services.SpecialityService;
import com.knkweb.mypetclinicapp.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialityService specialityService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialityService specialityService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialityService = specialityService;
    }

    @Override
    public void run(String... args) throws Exception {
        if(petTypeService.findAll().size() == 0){
            loadData();
        }
    }

    private void loadData() {
        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        Owner owner1 = new Owner();
//        owner1.setId(1L);
        owner1.setFirstName("Ram");
        owner1.setLastName("kumar");
//        owner1.setAddress("Tup");
        owner1.setAddress("Tup");
        owner1.setCity("Tiruppur");
        owner1.setTelephone("1237");
        ownerService.save(owner1);

        Pet mikesPet = new Pet();
        mikesPet.setName("Rosco");
        mikesPet.setBirthDate(LocalDate.now());
        mikesPet.setPetType(savedDogPetType);
        mikesPet.setOwner(owner1);
        owner1.getPets().add(mikesPet);

        Owner owner2 = new Owner();
//        owner2.setId(2L);
        owner2.setFirstName("Arav");
        owner2.setLastName("sha");
        owner1.setAddress("Cbe");
        owner1.setCity("Coimbatore");
        owner1.setTelephone("2459");
        ownerService.save(owner2);

        Pet fionasCat = new Pet();
        fionasCat.setName("kitty");
        fionasCat.setBirthDate(LocalDate.now());
        fionasCat.setPetType(savedCatPetType);
        fionasCat.setOwner(owner2);
        owner2.getPets().add(fionasCat);
        System.out.println("Owners loaded");

        Speciality radiology = new Speciality();
        radiology.setDescription("Radiology");
        Speciality savedRadiology = specialityService.save(radiology);
        Speciality surgery = new Speciality();
        surgery.setDescription("Surgery");
        Speciality savedSurgery = specialityService.save(surgery);
        Speciality dentistry = new Speciality();
        dentistry.setDescription("Dentistry");
        Speciality savedDentistry = specialityService.save(dentistry);


        Vet vet1 = new Vet();
//        vet1.setId(1L);
        vet1.setFirstName("Durai");
        vet1.setLastName("ravi");
        vet1.getSpecialities().add(savedRadiology);
        vetService.save(vet1);
        Vet vet2 = new Vet();
//        vet2.setId(2L);
        vet2.setFirstName("Sam");
        vet2.setLastName("vo");
        vet2.getSpecialities().add(savedSurgery);
        vetService.save(vet2);
        System.out.println("Vets loaded");
    }


}
