package com.knkweb.mypetclinicapp.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name = "pets")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class Pet extends BaseEntity {

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "type_id")
    private PetType petType;

    @ManyToOne
    @JoinColumn(name = "Owner_id")
    private Owner owner;

    @Column(name = "birth_date")
    private LocalDate birthDate;
}
