package com.miguelprojects.lab_3_08_modeling_complex_relationships.Gestion_Eventos.model;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "conferences")

public class Conference extends Event{
    // No necesita id porque lo hereda de event
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "conference_id")
//    private Long conferenceId;

    @OneToMany(mappedBy = "speakerConference")
    private List<Speaker> speakers;

    public Conference() {    }

    public Conference(List<Speaker> speakers) {
        this.speakers = speakers;
    }

    public Conference(Long eventId, int duration, String location, String title, List<Guest> guestList, List<Speaker> speakers) {
        super(eventId, duration, location, title, guestList);
        this.speakers = speakers;
    }

    public List<Speaker> getSpeakers() {
        return speakers;
    }

    public void setSpeakers(List<Speaker> speakers) {
        this.speakers = speakers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Conference that = (Conference) o;
        return Objects.equals(speakers, that.speakers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), speakers);
    }
}
