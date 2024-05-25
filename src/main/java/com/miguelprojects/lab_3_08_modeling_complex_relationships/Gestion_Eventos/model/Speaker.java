package com.miguelprojects.lab_3_08_modeling_complex_relationships.Gestion_Eventos.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "speakers")

public class Speaker{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "speaker_id")
    private Long speakerId;

    private String name;
    private int presentationDuration;

    @ManyToOne
    @JoinColumn(name = "conference", referencedColumnName = "event_id")
    private Conference speakerConference;

    public Speaker() {    }

    public Speaker(Long speakerId, String name, int presentationDuration, Conference speakerConference) {
        this.speakerId = speakerId;
        this.name = name;
        this.presentationDuration = presentationDuration;
        this.speakerConference = speakerConference;
    }

    public Long getSpeakerId() {
        return speakerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPresentationDuration() {
        return presentationDuration;
    }

    public void setPresentationDuration(int presentationDuration) {
        this.presentationDuration = presentationDuration;
    }

    public Conference getSpeakerConference() {
        return speakerConference;
    }

    public void setSpeakerConference(Conference speakerConference) {
        this.speakerConference = speakerConference;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Speaker speaker = (Speaker) o;
        return presentationDuration == speaker.presentationDuration && Objects.equals(speakerId, speaker.speakerId) && Objects.equals(name, speaker.name) && Objects.equals(speakerConference, speaker.speakerConference);
    }

    @Override
    public int hashCode() {
        return Objects.hash(speakerId, name, presentationDuration, speakerConference);
    }
}
