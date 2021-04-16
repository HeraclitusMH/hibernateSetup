package com.almaviva.service.persistence.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="POSSEDIMENTI")
public class Possedimenti implements Serializable {

    private static final long serialVersionUID = 1L;


    @ManyToOne(fetch = FetchType.LAZY) @JoinColumn(name = "umano_id")
    private PersonMod umano_id;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="tipoPossedimenti")
    private String tipoPossedimenti;

    public Possedimenti() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoPossedimenti() {
        return tipoPossedimenti;
    }

    public void setTipoPossedimenti(String tipoPossedimenti) {
        this.tipoPossedimenti = tipoPossedimenti;
    }

    public PersonMod getUmano_id() {
        return umano_id;
    }

    public void setUmano_id(PersonMod umano_id) {
        this.umano_id = umano_id;
    }
}
