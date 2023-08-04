package com.knkweb.mypetclinicapp.services.springdatajpa;

import com.knkweb.mypetclinicapp.model.Owner;
import com.knkweb.mypetclinicapp.repositories.OwnerRepository;
import com.knkweb.mypetclinicapp.repositories.PetRepository;
import com.knkweb.mypetclinicapp.repositories.VetRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class OwnerSDJpaServiceTest {
    @Mock
    OwnerRepository ownerRepository;

    @Mock
    PetRepository petRepository;

    @Mock
    VetRepository vetRepository;

    @InjectMocks
    OwnerSDJpaService ownerSDJpaService;

    Owner owner;

    @BeforeEach
    void setUp() {
        owner = Owner.builder().id(1L).lastName("Smith").build();

    }

    @Test
    void findByLastName() {
        ArgumentCaptor<String> argumentCaptor = ArgumentCaptor.forClass(String.class);
        when(ownerRepository.findByLastName(any())).thenReturn(owner);

        assertEquals(owner.getLastName(), ownerSDJpaService.findByLastName(owner.getLastName()).getLastName());

        verify(ownerRepository, times(1)).findByLastName(argumentCaptor.capture());
        assertEquals(owner.getLastName(), argumentCaptor.getValue());
    }

    @Test
    void findById() {
        when(ownerRepository.findById(any())).thenReturn(Optional.of(owner));
        Owner id = ownerSDJpaService.findById(owner.getId());
        assertEquals(owner.getId(), id.getId());
    }

    @Test
    void save() {
       ownerSDJpaService.save(Owner.builder().build());
       verify(ownerRepository, times(1)).save(any());
    }

    @Test
    void findAll() {
        ownerSDJpaService.findAll();
        verify(ownerRepository, times(1)).findAll();
    }

    @Test
    void delete() {
        ArgumentCaptor<Owner> argumentCaptor = ArgumentCaptor.forClass(Owner.class);
        ownerSDJpaService.delete(owner);
        verify(ownerRepository, times(1)).delete(argumentCaptor.capture());
        assertEquals(owner.getId(),argumentCaptor.getValue().getId());
    }

    @Test
    void deleteById() {
        ArgumentCaptor<Long> argumentCaptor = ArgumentCaptor.forClass(Long.class);
        ownerSDJpaService.deleteById(owner.getId());
        verify(ownerRepository, times(1)).deleteById(argumentCaptor.capture());
        assertEquals(owner.getId(),argumentCaptor.getValue());
    }
}