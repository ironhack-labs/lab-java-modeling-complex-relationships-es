package org.amazon.lab3_08.Model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Date date;
    private Integer duration;
    private String location;
    private String title;

    @ManyToMany(mappedBy = "events")
    private List<Invitado> guests;
}
