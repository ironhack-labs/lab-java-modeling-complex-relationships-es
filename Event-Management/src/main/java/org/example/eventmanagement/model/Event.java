package org.example.eventmanagement.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "events")
@Inheritance(strategy = InheritanceType.JOINED)
@Getter
@Setter
public class Event {

  @Id
  @Column(name = "event_id")
  private Long id;
  @Column(name = "event_title")
  private String title;
  @Column(name = "event_duration")
  private String duration;
  @Column(name = "event_location")
  private String location;
  @Column(name = "event_date")
  private LocalDate date;
  @OneToMany(mappedBy = "event", cascade = CascadeType.ALL)
  private List<Guest> guests;

}
