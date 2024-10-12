package org.example.eventmanagement.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.example.eventmanagement.enums.GuestStatus;

@Entity
@Table(name = "guests")
@Getter
@Setter
public class Guest {

  @Id
  private Long id;
  private String name;
  private GuestStatus status;
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "event_id")
  private Event event;
}
