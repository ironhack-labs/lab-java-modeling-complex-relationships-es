package org.ironhack.lab308.events;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Guest{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer guestId;

    private String guestName;

    @Enumerated (EnumType.STRING)
    private Status attendanceStatus;

    @ManyToMany (mappedBy = "guests")
    private List<Event> events;

    public Guest() {
    }

    public Guest(String guestName, Status attendanceStatus) {
        this.guestName = guestName;
        this.attendanceStatus = attendanceStatus;
    }

    public Integer getGuestId() {
        return guestId;
    }

    public void setGuestId(Integer guestId) {
        this.guestId = guestId;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public Status getAttendanceStatus() {
        return attendanceStatus;
    }

    public void setAttendanceStatus(Status attendanceStatus) {
        this.attendanceStatus = attendanceStatus;
    }
}
