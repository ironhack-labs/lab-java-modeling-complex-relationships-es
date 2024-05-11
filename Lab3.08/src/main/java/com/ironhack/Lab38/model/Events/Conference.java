package com.ironhack.Lab38.model.Events;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name="conferences")
public class Conference extends Event {

    @OneToMany(mappedBy = "conference")
    //@JoinColumn(name = "speaker_id", referencedColumnName = "id")
    private List<Speaker> speakers;

    public Conference(Date date, Integer duration, String location, String title, List<Guests> guests, List<Speaker> speakers) {
        super(date, duration, location, title, guests);
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
