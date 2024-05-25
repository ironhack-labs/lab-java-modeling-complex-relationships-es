package com.miguelprojects.lab_3_08_modeling_complex_relationships.Gestion_Eventos.model;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "expositions")

public class Exposition extends Event{

    //No necesita id porque lo hereda de event
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "exposition_id")
//    private Long expositionId;

    public Exposition() {    }

    public Exposition(Long eventId, int duration, String location, String title, List<Guest> guestList) {
        super(eventId, duration, location, title, guestList);
    }

}
