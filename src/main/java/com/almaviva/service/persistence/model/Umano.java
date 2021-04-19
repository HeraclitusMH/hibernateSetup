package com.almaviva.service.persistence.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@MappedSuperclass
public class Umano implements Serializable {

    private static final long serialVersionUID = 1L;
    private List<Possedimenti> possedimentiList;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="idUmano")
    private String idUmano;

    @Column(table = "umano")
    private boolean anima;

    public Umano() {
    }

    public String getIdUmano() {
        return idUmano;
    }

    public void setIdUmano(String idUmano) {
        this.idUmano = idUmano;
    }

    public Boolean getAnima() {
        return anima;
    }

    public void setAnima(Boolean anima) {
        this.anima = anima;
    }

    public List<Possedimenti> getPossedimentiList() {
        return possedimentiList;
    }

    public void setPossedimentiList(List<Possedimenti> possedimentiList) {
        this.possedimentiList = possedimentiList;
    }
}
