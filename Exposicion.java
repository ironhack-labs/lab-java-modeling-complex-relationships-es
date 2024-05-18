package com.ironhack.asociacion.enfermeras.model;

import javax.persistence.Entity;
import java.util.Date;
import java.util.List;

@Entity
public class Exposicion extends Evento {


    public Exposicion() {
    }


    public Exposicion(Date date, int duration, String location, String title, List<Invitado> list) {
        super(date, duration, location, title, list);
    }
}
