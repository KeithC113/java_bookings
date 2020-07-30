package com.codeclan.example.BookingSystem.controllers;

import com.codeclan.example.BookingSystem.repositories.BookingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookingController {

@Autowired
    BookingsRepository bookingsRepository;

}
