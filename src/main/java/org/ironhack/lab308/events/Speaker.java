package org.ironhack.lab308.events;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Speaker{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer speakerId;

    private String speakerName;
    private int presentationDuration;

    public Speaker() {
    }

    public Speaker(String speakerName, int presentationDuration) {
        this.speakerName = speakerName;
        this.presentationDuration = presentationDuration;
    }

    public String getSpeakerName() {
        return speakerName;
    }

    public void setSpeakerName(String speakerName) {
        this.speakerName = speakerName;
    }

    public int getPresentationDuration() {
        return presentationDuration;
    }

    public void setPresentationDuration(int presentationDuration) {
        this.presentationDuration = presentationDuration;
    }
}
