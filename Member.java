//EJERCICIO - 1 --------------------------------------

// DEFINIR ENTIDAD "MEMBER"----------------------------

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private Status status;

    private LocalDate renewalDate;


    public Member() {}

    public Member(String name, Status status, LocalDate renewalDate) {
        this.name = name;
        this.status = status;
        this.renewalDate = renewalDate;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public Status getStatus() { return status; }
    public void setStatus(Status status) { this.status = status; }
    public LocalDate getRenewalDate() { return renewalDate; }
    public void setRenewalDate(LocalDate renewalDate) { this.renewalDate = renewalDate; }
}


//ENUMERACION "STATUS"--------------------------------------

public enum Status {
    ACTIVE, LAPSED
}


//DEFINIR ENTIDAD "DIVISION"------------------------------

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Division {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String district;

    @OneToOne
    @JoinColumn(name = "president_id", nullable = false)
    private Member president;

    @OneToMany
    @JoinColumn(name = "division_id")
    private List<Member> members = new ArrayList<>();


    public Division() {}

    public Division(String name, String district, Member president) {
        this.name = name;
        this.district = district;
        this.president = president;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getDistrict() { return district; }
    public void setDistrict(String district) { this.district = district; }
    public Member getPresident() { return president; }
    public void setPresident(Member president) { this.president = president; }
    public List<Member> getMembers() { return members; }
    public void setMembers(List<Member> members) { this.members = members; }
}


//EJERCICIO - 2 ---------------------------------------

//ENTIDAD BASE "EVENT"-------------------------------

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate date;
    private int duration;
    private String location;
    private String title;

    @OneToMany(mappedBy = "event", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Invitee> invitees = new ArrayList<>();


    public Event() {}

    public Event(LocalDate date, int duration, String location, String title) {
        this.date = date;
        this.duration = duration;
        this.location = location;
        this.title = title;
    }

    public Long getId() { return id; }
    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }
    public int getDuration() { return duration; }
    public void setDuration(int duration) { this.duration = duration; }
    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public List<Invitee> getInvitees() { return invitees; }
    public void setInvitees(List<Invitee> invitees) { this.invitees = invitees; }
}


//ENTIDAD "INVITEE" --------------------------------

import javax.persistence.*;

@Entity
public class Invitee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private Status status;

    @ManyToOne
    @JoinColumn(name = "event_id", nullable = false)
    private Event event;


    public Invitee() {}

    public Invitee(String name, Status status, Event event) {
        this.name = name;
        this.status = status;
        this.event = event;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public Status getStatus() { return status; }
    public void setStatus(Status status) { this.status = status; }
    public Event getEvent() { return event; }
    public void setEvent(Event event) { this.event = event; }
}


//SUBCLASE "CONFERENCE"------------------------------

@Entity
public class Conference extends Event {

    public Conference() {}

    public Conference(LocalDate date, int duration, String location, String title) {
        super(date, duration, location, title);
    }
}


//SUBCLASE "EXHIBITION"-----------------------------

@Entity
public class Exhibition extends Event {

    public Exhibition() {}

    public Exhibition(LocalDate date, int duration, String location, String title) {
        super(date, duration, location, title);
    }
}

//ENUMERACION "STATUS"--------------------------------

public enum Status {
    ATTENDING, NOT_ATTENDING, NO_RESPONSE
}


