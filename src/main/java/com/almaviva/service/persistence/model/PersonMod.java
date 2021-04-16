package com.almaviva.service.persistence.model;

import javax.persistence.*;
import javax.persistence.Table;
import javax.persistence.Column;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="PERSON")
@SecondaryTables({@SecondaryTable(name="umano", pkJoinColumns={@PrimaryKeyJoinColumn(name="id") })})
public class PersonMod extends Umano implements Serializable {

    private static final long serialVersionUID = 1L;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "umano_id")
    private List<Possedimenti> possedimentiList;

    @Column(name="firstName")
    private String firstNameMod;

    @Column(name="lastName")
    private String lastNameMod;

    public PersonMod() {
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

    public List<Possedimenti> getPossedimentiList() {
        return possedimentiList;
    }

    public void setPossedimentiList(List<Possedimenti> possedimentiList) {
        this.possedimentiList = possedimentiList;
    }

}
