package org.alvarowau.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "speakers")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Speaker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int presentationDuration;
}
