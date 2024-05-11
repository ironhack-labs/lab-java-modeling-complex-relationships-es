package com.ironhack.LabModeling.GestionEventos;

import jakarta.persistence.*;

import java.util.List;

@Entity
@DiscriminatorValue("conferences")
public class Conference extends Events{

    @ManyToMany
    @JoinTable(
            name = "conference_speakers",
            joinColumns = @JoinColumn(name = "conference_id"),
            inverseJoinColumns = @JoinColumn(name = "speaker_id")
    )
    private List<Speaker> speakers;

}
