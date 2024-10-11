package org.alvarowau.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "conferences")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Conference extends Event {

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "conference_id")
    private List<Speaker> speakers;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "event_id")
    private List<Guest> guests;
}
