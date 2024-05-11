package com.ironhack.LabModeling.GestionEventos;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "event_type", discriminatorType = DiscriminatorType.STRING)
public abstract class Events {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Date date;
    private long duration;
    private String location;
    private String title;

    @OneToMany(mappedBy = "events")
    private List<Guests> guests;

    public Date getDate() {
        return date;
    }

    public void setDate() {
        this.date = date;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Guests> getGuests() {
        return guests;
    }

    public void setGuests(List<Guests> guests) {
        this.guests = guests;
    }
}
