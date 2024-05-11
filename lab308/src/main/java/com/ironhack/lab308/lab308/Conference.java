package com.ironhack.lab308.lab308;

import jakarta.persistence.*;

import java.util.List;

@Entity
@DiscriminatorValue("conference")
public class Conference extends Event {
    @OneToMany(mappedBy = "conference", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Speaker> speakers;

    // getters setters
}
