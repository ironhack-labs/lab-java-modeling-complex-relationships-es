package com.miguelprojects.lab_3_08_modeling_complex_relationships.Gestion_Eventos.model;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "events")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "Event type")
@DiscriminatorValue("EVENT")

public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "event_id")
    private Long eventId;

    private int duration;
    private String location;
    private String title;

    @OneToMany (mappedBy = "eventGuest")
    private List<Guest> guestList;


    public Event() {    }

    public Event(int duration, String location, String title, List<Guest> guestList) {
        this.duration = duration;
        this.location = location;
        this.title = title;
        this.guestList = guestList;
    }

    public Long getEventId() {
        return eventId;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
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

    public List<Guest> getGuestList() {
        return guestList;
    }

    public void setGuestList(List<Guest> guestList) {
        this.guestList = guestList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return duration == event.duration && Objects.equals(eventId, event.eventId) && Objects.equals(location, event.location) && Objects.equals(title, event.title) && Objects.equals(guestList, event.guestList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventId, duration, location, title, guestList);
    }
}
