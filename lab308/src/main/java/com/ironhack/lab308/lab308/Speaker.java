package com.ironhack.lab308.lab308;

import jakarta.persistence.*;

@Entity
public class Speaker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int presentationDuration;

    @ManyToOne
    @JoinColumn(name = "conference_id")
    private Conference conference;

    // getters setters

}
