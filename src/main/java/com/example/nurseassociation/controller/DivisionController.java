package com.example.nurseassociation.controller;

import com.example.nurseassociation.service.DivisionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/api/divisions")
public class DivisionController {
    private final DivisionService divisionService;

    public DivisionController(DivisionService divisionService) {
        this.divisionService = divisionService;
    }

    @GetMapping
    public <Division> Collection<Division> getAllDivisions() {
        return (java.util.List<Division>) divisionService.getAllDivisions();
    }

    @PostMapping
    public DivisionController createDivision(@RequestBody DivisionController division) {
        return (DivisionController) divisionService.saveDivision(division);
    }
}
