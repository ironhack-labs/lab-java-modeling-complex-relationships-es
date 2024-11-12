package com.example.nursingassociation.controller;

import com.example.nursingassociation.entity.Division;
import com.example.nursingassociation.repository.DivisionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/divisions")
public class DivisionController {

    @Autowired
    private DivisionRepository divisionRepository;

    @GetMapping
    public List<Division> getAllDivisions() {
        return divisionRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Division> getDivisionById(@PathVariable Long id) {
        return divisionRepository.findById(id)
                .map(division -> ResponseEntity.ok().body(division))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Division createDivision(@RequestBody Division division) {
        return divisionRepository.save(division);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Division> updateDivision(@PathVariable Long id, @RequestBody Division divisionDetails) {
        return divisionRepository.findById(id)
                .map(division -> {
                    division.setName(divisionDetails.getName());
                    division.setDistrict(divisionDetails.getDistrict());
                    division.setPresident(divisionDetails.getPresident());
                    division.setMembers(divisionDetails.getMembers());
                    Division updatedDivision = divisionRepository.save(division);
                    return ResponseEntity.ok().body(updatedDivision);
                }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteDivision(@PathVariable Long id) {
        return divisionRepository.findById(id)
                .map(division -> {
                    divisionRepository.delete(division);
                    return ResponseEntity.ok().build();
                }).orElse(ResponseEntity.notFound().build());
    }
}

