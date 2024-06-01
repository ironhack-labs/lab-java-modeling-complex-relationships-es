package com.miguelprojects.lab_3_08_modeling_complex_relationships.Gestion_Eventos.model;

import com.miguelprojects.lab_3_08_modeling_complex_relationships.Asociacion_Enfermeras.model.Division;
import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "guests")

public class Guest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "guest_id")
    private Long guestId;

    private String name;

    @Enumerated(EnumType.STRING)
    private Status status;

    @ManyToOne
    @JoinColumn(name = "eventId", referencedColumnName = "event_id")
    private Event eventGuest;

    public Guest() {    }

    public Guest(String name, Status status, Event eventGuest) {
        this.name = name;
        this.status = status;
        this.eventGuest = eventGuest;
    }

    public Long getGuestId() {
        return guestId;
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

    public Event getEventGuest() {
        return eventGuest;
    }

    public void setEventGuest(Event eventGuest) {
        this.eventGuest = eventGuest;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Guest guest = (Guest) o;
        return Objects.equals(guestId, guest.guestId) && Objects.equals(name, guest.name) && status == guest.status && Objects.equals(eventGuest, guest.eventGuest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(guestId, name, status, eventGuest);
    }
}
