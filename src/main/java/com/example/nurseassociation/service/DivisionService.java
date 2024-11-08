package com.example.nurseassociation.service;

import com.example.nurseassociation.controller.DivisionController;
import org.springframework.stereotype.Service;
import java.util.List;

@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
@Service
public class DivisionService {
    private final com.example.nurseassociation.service.DivisionRepository divisionRepository;

    public <DivisionRepository> DivisionService(DivisionRepository divisionRepository) {
        this.divisionRepository = (com.example.nurseassociation.service.DivisionRepository) divisionRepository;
    }

    public List<Division> getAllDivisions() {
        return divisionRepository.findAll();
    }

    public Division saveDivision(DivisionController division) {
        return divisionRepository.save(division);
    }
}
