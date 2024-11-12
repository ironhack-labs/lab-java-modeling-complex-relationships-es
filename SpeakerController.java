package com.example.eventmanagement.controller;

import com.example.eventmanagement.entity.Speaker;
import com.example.eventmanagement.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/speakers")
public class SpeakerController {

    @Autowired
    private SpeakerRepository speakerRepository;

    @GetMapping
    public List<Speaker> getAllSpeakers() {
        return speakerRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Speaker> getSpeakerById(@PathVariable Long id) {
        return speakerRepository.findById(id)
                .map(speaker -> ResponseEntity.ok().body(speaker))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Speaker createSpeaker(@RequestBody Speaker speaker) {
        return speakerRepository.save(speaker);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Speaker> updateSpeaker(@PathVariable Long id, @RequestBody Speaker speakerDetails) {
        return speakerRepository.findById(id)
                .map(speaker -> {
                    speaker.setName(speakerDetails.getName());
                    speaker.setPresentationDuration(speakerDetails.getPresentationDuration());
                    Speaker updatedSpeaker = speakerRepository.save(speaker);
                    return ResponseEntity.ok().body(updatedSpeaker);
                }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteSpeaker(@PathVariable Long id) {
        return speakerRepository.findById(id)
                .map(speaker -> {
                    speakerRepository.delete(speaker);
                    return ResponseEntity.ok().build();
                }).orElse(ResponseEntity.notFound().build());
    }
}

