package com.ironhack.lab_308.lab_3_08.gestion_eventos.model;

import com.ironhack.lab_308.lab_3_08.gestion_eventos.enums.Status;
import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "guests")
@Inheritance(strategy = InheritanceType.JOINED)
public class Guest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer guestId;
    private String name;

    @Enumerated(EnumType.STRING)
    private Status status;

    @ManyToMany
    @JoinTable(
            name = "guest_event",
            joinColumns = {@JoinColumn(name = "event_id")}
    )
    private List<Event> events;

    public Guest(Integer guestId, String name, Status status, List<Event> events) {
        this.guestId = guestId;
        this.name = name;
        this.status = status;
        this.events = events;
    }

    public Guest(Integer guestId) {
        this.guestId = guestId;
    }

    public Guest(String name, Status status, List<Event> events) {
        this.name = name;
        this.status = status;
        this.events = events;
    }

    public Guest(String name, Status status) {
        this.name = name;
        this.status = status;
    }
    public Guest(){}

    public Integer getGuestId() {
        return guestId;
    }

    public void setGuestId(Integer guestId) {
        this.guestId = guestId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Guest guest = (Guest) o;
        return Objects.equals(guestId, guest.guestId) && Objects.equals(name, guest.name) && status == guest.status && Objects.equals(events, guest.events);
    }

    @Override
    public int hashCode() {
        return Objects.hash(guestId, name, status, events);
    }
}
