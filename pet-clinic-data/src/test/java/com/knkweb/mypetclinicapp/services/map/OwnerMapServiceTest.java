package com.knkweb.mypetclinicapp.services.map;

import com.knkweb.mypetclinicapp.model.Owner;
import com.knkweb.mypetclinicapp.services.PetService;
import com.knkweb.mypetclinicapp.services.PetTypeService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class OwnerMapServiceTest {

    OwnerMapService ownerMapService;

    final Long ownerId = 1L;
    final String lastName = "Smith";

    @BeforeEach
    void setUp() {
        ownerMapService = new OwnerMapService(new PetTypeMapService(), new PetMapService());
        ownerMapService.save(Owner.builder().lastName(lastName).id(ownerId).build());
    }

    @Test
    void findById() {
        assertEquals(lastName, ownerMapService.findById(ownerId).getLastName());
    }

    @Test
    void save() {
        Owner o1 = ownerMapService.save(Owner.builder().build());
        assertNotNull(o1);
        assertNotNull(o1.getId());
    }


    @Test
    void delete() {
        ownerMapService.delete(ownerMapService.findById(ownerId));
        assertEquals(0,ownerMapService.findAll().size());

    }

    @Test
    void deleteById() {
        ownerMapService.deleteById(ownerId);
        assertEquals(0,ownerMapService.findAll().size());

    }

    @Test
    void findByLastName() {
        assertEquals(lastName,ownerMapService.findByLastName(lastName).getLastName());
    }

    @Test
    void findByLastNameNull() {
        assertNull(ownerMapService.findByLastName("fodch"));
    }
}