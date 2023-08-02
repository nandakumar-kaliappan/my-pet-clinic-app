package com.knkweb.mypetclinicapp.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "pet_types")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class PetType extends BaseEntity {

    @Column(name = "name")
    private String name;
}
