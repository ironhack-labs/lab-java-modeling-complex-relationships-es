package com.miguelprojects.lab_3_08_modeling_complex_relationships.Gestion_Eventos.model;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "expositions")
@DiscriminatorValue("EXPOSITION")

public class Exposition extends Event{

    //No necesita id porque lo hereda de event
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "exposition_id")
//    private Long expositionId;

    public Exposition() {    }

    public Exposition(int duration, String location, String title, List<Guest> guestList) {
        super(duration, location, title, guestList);
    }

}
