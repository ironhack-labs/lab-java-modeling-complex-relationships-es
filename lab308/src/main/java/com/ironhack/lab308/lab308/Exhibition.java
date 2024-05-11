package com.ironhack.lab308.lab308;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import java.util.Date;

@Entity
@DiscriminatorValue("exhibition")
public class Exhibition extends Event {
    // no additional fields

    // Constructors
    public Exhibition() {
        // No-argument constructor
    }

    // Getters
    public Long getId() { return id; }
    public Date getDate() { return date; }
    public int getDuration() { return duration; }
    public String getLocation() { return location; }
    public String getTitle() { return title; }

    // Setters
    public void setId(Long id) { this.id = id; }
    public void setDate(Date date) { this.date = date; }
    public void setDuration(int duration) { this.duration = duration; }
    public void setLocation(String location) { this.location = location; }
    public void setTitle(String title) { this.title = title; }
}

