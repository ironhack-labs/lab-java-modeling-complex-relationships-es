package com.ironhack.LabModeling.GestionEventos;

import jakarta.persistence.*;

@Entity
public class Guests {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private GuestsStatus status;

    @ManyToOne
    @JoinColumn(name = "events_id")
    private Events events;
}
