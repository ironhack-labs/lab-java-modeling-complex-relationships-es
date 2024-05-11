package com.ironhack.Lab38.model.Association;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DivisionTest {

    @Test
    void createDivision() {
        Division division = new Division();
        division.setName("Division");
    }
}