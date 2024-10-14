package org.amazon.lab3_08.Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Conference extends Evento{

    @ManyToMany
    @JoinTable(
            name = "conference_speakers",
            joinColumns = {@JoinColumn(name = "event_id")},
            inverseJoinColumns = {@JoinColumn(name = "speakers_id")}
    )
    private List<Oradores> oradores ;

}
