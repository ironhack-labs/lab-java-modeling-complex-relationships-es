package org.alvarowau.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "expositions")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Exposition extends Event {

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "event_id")
    private List<Guest> guests;

}
