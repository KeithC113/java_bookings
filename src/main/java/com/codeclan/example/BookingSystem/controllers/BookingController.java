package com.codeclan.example.BookingSystem.controllers;

import com.codeclan.example.BookingSystem.models.Booking;
import com.codeclan.example.BookingSystem.models.Course;
import com.codeclan.example.BookingSystem.repositories.BookingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class BookingController {

    @Autowired
        BookingsRepository bookingsRepository;

    @GetMapping(value = "/bookings")
        public ResponseEntity<List<Booking>> getAllBookings(){
        return new ResponseEntity<>(bookingsRepository.findAll(), HttpStatus.OK);

    }
    @GetMapping(value = "/bookings/{id}")
    public Optional<Booking> getBookings(@PathVariable Long id){
        return bookingsRepository.findById(id);
    }


}
