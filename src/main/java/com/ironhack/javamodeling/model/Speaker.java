package com.ironhack.javamodeling.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * Speaker
 */
@Entity
public class Speaker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String presentationDuration;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPresentationDuration() {
        return presentationDuration;
    }
    public void setPresentationDuration(String presentationDuration) {
        this.presentationDuration = presentationDuration;
    }

 

    
}
