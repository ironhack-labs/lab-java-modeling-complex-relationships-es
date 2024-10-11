package org.alvarowau.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "members")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @Enumerated(EnumType.STRING)
    private Status status;

    private LocalDate renewal;

    @ManyToOne
    @JoinColumn(name = "division_id")
    private Division division;


    public void updateStatus() {
        if (renewal.isBefore(LocalDate.now())) {
            this.status = Status.LAPSED;
        } else {
            this.status = Status.ACTIVE;
        }
    }

}