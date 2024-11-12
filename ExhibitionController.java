package com.example.eventmanagement.controller;

import com.example.eventmanagement.entity.Exhibition;
import com.example.eventmanagement.repository.ExhibitionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/exhibitions")
public class ExhibitionController {

    @Autowired
    private ExhibitionRepository exhibitionRepository;

    @GetMapping
    public List<Exhibition> getAllExhibitions() {
        return exhibitionRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Exhibition> getExhibitionById(@PathVariable Long id) {
        return exhibitionRepository.findById(id)
                .map(exhibition -> ResponseEntity.ok().body(exhibition))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Exhibition createExhibition(@RequestBody Exhibition exhibition) {
        return exhibitionRepository.save(exhibition);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Exhibition> updateExhibition(@PathVariable Long id, @RequestBody Exhibition exhibitionDetails) {
        return exhibitionRepository.findById(id)
                .map(exhibition -> {
                    exhibition.setDate(exhibitionDetails.getDate());
                    exhibition.setDuration(exhibitionDetails.getDuration());
                    exhibition.setLocation(exhibitionDetails.getLocation());
                    exhibition.setTitle(exhibitionDetails.getTitle());
                    exhibition.setGuests(exhibitionDetails.getGuests());
                    Exhibition updatedExhibition = exhibitionRepository.save(exhibition);
                    return ResponseEntity.ok().body(updatedExhibition);
                }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteExhibition(@PathVariable Long id) {
        return exhibitionRepository.findById(id)
                .map(exhibition -> {
                    exhibitionRepository.delete(exhibition);
                    return ResponseEntity.ok().build();
                }).orElse(ResponseEntity.notFound().build());
    }
}
