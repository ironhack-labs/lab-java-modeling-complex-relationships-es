package com.ironhack.LabModeling.GestionEventos;

import jakarta.persistence.*;

@Entity
public class Speaker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private long presentationDuration;

    @ManyToOne
    @JoinColumn(name = "conferences_id")
    private Conference conference;
}
