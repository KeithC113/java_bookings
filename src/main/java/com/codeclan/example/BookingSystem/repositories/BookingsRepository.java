package com.codeclan.example.BookingSystem.repositories;

import com.codeclan.example.BookingSystem.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingsRepository extends JpaRepository <Booking, Long>{
}
