package com.knkweb.mypetclinicapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "pettypes")
public class PetType extends BaseEntity {

    @Column(name = "name")
    private String name;

    public PetType() {
    }

    public PetType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
