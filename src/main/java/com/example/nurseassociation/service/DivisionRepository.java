package com.example.nurseassociation.service;

import com.example.nurseassociation.controller.DivisionController;

import java.util.List;

public class DivisionRepository {
    public <Division> List<Division> findAll() {
        return null;
    }

    public <Division> Division save(DivisionController division) {

        return (Division) division;
    }
}
