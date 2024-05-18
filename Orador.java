package com.ironhack.asociacion.enfermeras.model;

import javax.persistence.*;

@Entity
public class Orador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int presentationDuration;


    public Orador() {
    }


    public Orador(String name, int presentationDuration) {
        this.name = name;
        this.presentationDuration = presentationDuration;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPresentationDuration() {
        return presentationDuration;
    }

    public void setPresentationDuration(int presentationDuration) {
        this.presentationDuration = presentationDuration;
    }
}
