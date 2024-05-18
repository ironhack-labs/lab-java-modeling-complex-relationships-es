package com.ironhack.asociacion.enfermeras.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Conferencia extends Evento {

    @OneToMany
    private List<Orador> oradores;


    public Conferencia() {
    }


    public Conferencia(Date date, int duration, String location, String title, List<Invitado> list, List<Orador> oradores) {
        super(date, duration, location, title, list);
        this.oradores = oradores;
    }


    public List<Orador> getOradores() {
        return oradores;
    }

    public void setOradores(List<Orador> oradores) {
        this.oradores = oradores;
    }
}
