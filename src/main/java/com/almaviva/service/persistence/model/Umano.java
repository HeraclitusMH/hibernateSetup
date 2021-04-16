package com.almaviva.service.persistence.model;

import javax.persistence.*;
import java.io.Serializable;

@MappedSuperclass
public class Umano implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id")
    private int id;

    @Column(table = "umano")
    private boolean anima;

    public Umano() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Boolean getAnima() {
        return anima;
    }

    public void setAnima(Boolean anima) {
        this.anima = anima;
    }
}
