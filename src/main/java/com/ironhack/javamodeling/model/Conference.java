package com.ironhack.javamodeling.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

/**
 * Conference
 */
@Entity
public class Conference extends Event{
    
    @OneToMany
    private List<Speaker> speakers;

}
