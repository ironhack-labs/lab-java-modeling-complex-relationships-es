package com.ironhack.LabModeling.GestionEventos;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Speaker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @Temporal(TemporalType.TIME)
    private long presentationDuration;

    @ManyToMany
    @JoinTable(
            name = "conference_speakers",
            inverseJoinColumns = @JoinColumn(name = "conference_id"),
            joinColumns = @JoinColumn(name = "speaker_id")
    )
    private List<Conference> conferences;

    public int getId() {
        return id;
    }

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
