package com.example.eventmanagement.controller;

import com.example.eventmanagement.entity.Guest;
import com.example.eventmanagement.repository.GuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/guests")
public class GuestController {

    @Autowired
    private GuestRepository guestRepository;

    @GetMapping
    public List<Guest> getAllGuests() {
        return guestRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Guest> getGuestById(@PathVariable Long id) {
        return guestRepository.findById(id)
                .map(guest -> ResponseEntity.ok().body(guest))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Guest createGuest(@RequestBody Guest guest) {
        return guestRepository.save(guest);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Guest> updateGuest(@PathVariable Long id, @RequestBody Guest guestDetails) {
        return guestRepository.findById(id)
                .map(guest -> {
                    guest.setName(guestDetails.getName());
                    guest.setStatus(guestDetails.getStatus());
                    Guest updatedGuest = guestRepository.save(guest);
                    return ResponseEntity.ok().body(updatedGuest);
                }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteGuest(@PathVariable Long id) {
        return guestRepository.findById(id)
                .map(guest -> {
                    guestRepository.delete(guest);
                    return ResponseEntity.ok().build();
                }).orElse(ResponseEntity.notFound().build());
    }
}
