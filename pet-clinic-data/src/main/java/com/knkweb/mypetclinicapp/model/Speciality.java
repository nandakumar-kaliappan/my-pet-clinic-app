package com.knkweb.mypetclinicapp.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "specialities")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class Speciality extends  BaseEntity{

    @Column(name = "description")
    private String description;

}
