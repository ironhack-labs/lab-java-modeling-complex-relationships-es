package com.example.eventmanagement.controller;

import com.example.eventmanagement.entity.Conference;
import com.example.eventmanagement.repository.ConferenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/conferences")
public class ConferenceController {

    @Autowired
    private ConferenceRepository conferenceRepository;

    @GetMapping
    public List<Conference> getAllConferences() {
        return conferenceRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Conference> getConferenceById(@PathVariable Long id) {
        return conferenceRepository.findById(id)
                .map(conference -> ResponseEntity.ok().body(conference))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Conference createConference(@RequestBody Conference conference) {
        return conferenceRepository.save(conference);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Conference> updateConference(@PathVariable Long id, @RequestBody Conference conferenceDetails) {
        return conferenceRepository.findById(id)
                .map(conference -> {
                    conference.setDate(conferenceDetails.getDate());
                    conference.setDuration(conferenceDetails.getDuration());
                    conference.setLocation(conferenceDetails.getLocation());
                    conference.setTitle(conferenceDetails.getTitle());
                    conference.setGuests(conferenceDetails.getGuests());
                    conference.setSpeakers(conferenceDetails.getSpeakers());
                    Conference updatedConference = conferenceRepository.save(conference);
                    return ResponseEntity.ok().body(updatedConference);
                }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteConference(@PathVariable Long id) {
        return conferenceRepository.findById(id)
                .map(conference -> {
                    conferenceRepository.delete(conference);
                    return ResponseEntity.ok().build();
                }).orElse(ResponseEntity.notFound().build());
    }
}
