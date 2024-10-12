package com.asociacion.asociacionenfermeras.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Conferencia extends Evento {

    @OneToMany(cascade = CascadeType.ALL)
    private List <Orador> oradores;

    //Getters and Setters


    public List<Orador> getOradores() {
        return oradores;
    }

    public void setOradores(List<Orador> oradores) {
        this.oradores = oradores;
    }
}
