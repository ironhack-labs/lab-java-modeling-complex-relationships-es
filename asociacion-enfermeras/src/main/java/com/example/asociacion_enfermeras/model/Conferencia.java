package com.example.asociacion_enfermeras.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Conferencia extends Evento {
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Orador> speakers;
    public Conferencia() {

    }
    public List<Orador> getSpeakers(){
        return speakers;
    }
    public void setSpeakers(List<Orador>speakers){
        this.speakers = speakers;
    }

}
