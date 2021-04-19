package com.almaviva.service.persistence.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="POSSEDIMENTI")
public class Possedimenti implements Serializable {

    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idPossedimenti")
    private int idPossedimenti;

    @Column(name="tipoPossedimenti")
    private String tipoPossedimenti;

    public Possedimenti() {
    }

    public int getIdPossedimenti() {
        return idPossedimenti;
    }

    public void setIdPossedimenti(int idPossedimenti) {
        this.idPossedimenti = idPossedimenti;
    }

    public String getTipoPossedimenti() {
        return tipoPossedimenti;
    }

    public void setTipoPossedimenti(String tipoPossedimenti) {
        this.tipoPossedimenti = tipoPossedimenti;
    }

}
