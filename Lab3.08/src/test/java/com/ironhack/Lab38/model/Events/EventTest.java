package com.ironhack.Lab38.model.Events;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EventTest {

    @Test
    void createEvent() {
        Event event = new Event();
        assertNotNull(event);
    }

    @Test
    void getEventId() {
        Event event = new Event();
        assertEquals(event.getId(), 0);
    }
}