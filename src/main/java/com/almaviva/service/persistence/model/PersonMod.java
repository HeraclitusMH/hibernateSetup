package com.almaviva.service.persistence.model;

import javax.persistence.*;
import javax.persistence.Table;
import javax.persistence.Column;
import java.io.Serializable;

@Entity
@Table(name="PERSON")
public class PersonMod implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int idMod;

    @Column(name="firstName")
    private String firstNameMod;

    @Column(name="lastName")
    private String lastNameMod;

    public PersonMod() {
    }

    public int getIdMod() {
        return idMod;
    }

    public void setIdMod(int id) {
        this.idMod = id;
    }

    public String getFirstNameMod() {
        return firstNameMod;
    }

    public void setFirstNameMod(String firstName) {
        this.firstNameMod = firstName;
    }

    public String getLastNameMod() {
        return lastNameMod;
    }

    public void setLastNameMod(String lastName) {
        this.lastNameMod = lastName;
    }
}
