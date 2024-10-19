package org.ironhack.lab3_08.exercise2.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.time.LocalDate;
import java.util.List;

@Entity
@DiscriminatorValue("CONFERENCE")
public class Conference extends Event {
    @OneToMany(mappedBy = "conference")
    private List<Speaker> speakers;

    public Conference(Integer id, LocalDate date, String duration, String location, String title, List<Guest> guests, List<Speaker> speakers) {
        super(id, date, duration, location, title, guests);
        this.speakers = speakers;
    }

    public Conference(List<Speaker> speakers) {
        this.speakers = speakers;
    }

    public Conference(LocalDate date, String duration, String location, String title, List<Speaker> speakers) {
        super(date, duration, location, title);
        this.speakers = speakers;
    }

    public Conference() {}

    public List<Speaker> getSpeakers() {
        return speakers;
    }

    public void setSpeakers(List<Speaker> speakers) {
        this.speakers = speakers;
    }
}

