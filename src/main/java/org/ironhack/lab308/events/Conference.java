package org.ironhack.lab308.events;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Conference extends Event{

    @OneToMany(mappedBy = "conference")
    private List<Speaker> speakerList;

    public Conference(List<Speaker> speakerList) {
        this.speakerList = speakerList;
    }

    public Conference() {

    }

    public void setSpeakerList(List<Speaker> speakerList) {
        this.speakerList = speakerList;
    }
}
