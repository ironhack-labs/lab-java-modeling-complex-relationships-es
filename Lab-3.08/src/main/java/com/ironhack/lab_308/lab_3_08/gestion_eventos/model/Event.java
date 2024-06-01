package com.ironhack.lab_308.lab_3_08.gestion_eventos.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "events")
@Inheritance(strategy = InheritanceType.JOINED)
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer eventId;
    private Date date;
    private Integer duration;
    private String location;
    private String title;

    @ManyToMany(mappedBy = "events")
    private List<Guest> guests;

    public Event(Integer eventId, Date date, Integer duration, String location, String title, List<Guest> guests) {
        this.eventId = eventId;
        this.date = date;
        this.duration = duration;
        this.location = location;
        this.title = title;
        this.guests = guests;
    }

    public Event(){}

    public Event(Date date, Integer duration, String location, String title) {
        this.date = date;
        this.duration = duration;
        this.location = location;
        this.title = title;
    }

    public Integer getEventId() {
        return eventId;
    }

    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
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

    public List<Guest> getGuests() {
        return guests;
    }

    public void setGuests(List<Guest> guests) {
        this.guests = guests;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return Objects.equals(eventId, event.eventId) && Objects.equals(date, event.date) && Objects.equals(duration, event.duration) && Objects.equals(location, event.location) && Objects.equals(title, event.title) && Objects.equals(guests, event.guests);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventId, date, duration, location, title, guests);
    }
}
