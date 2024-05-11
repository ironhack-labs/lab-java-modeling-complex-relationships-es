package com.ironhack.LabModeling.GestionEventos;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Speaker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private long presentationDuration;

    @OneToMany(mappedBy = "speaker")
    private List<Conference> conferences;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPresentationDuration() {
        return presentationDuration;
    }

    public void setPresentationDuration(long presentationDuration) {
        this.presentationDuration = presentationDuration;
    }

    public List<Conference> getConferences() {
        return conferences;
    }

    public void setConferences(List<Conference> conferences) {
        this.conferences = conferences;
    }
}
