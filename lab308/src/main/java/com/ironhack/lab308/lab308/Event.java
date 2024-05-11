package com.ironhack.lab308.lab308;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "event_type")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date;
    private int duration;
    private String location;
    private String title;

    @OneToMany(mappedBy = "event", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Guest> guests;

    private Long getId() {
        return id;
    }

    private Date getDate() {
        return date;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
