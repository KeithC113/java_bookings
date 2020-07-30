package com.codeclan.example.BookingSystem.repositories;

import com.codeclan.example.BookingSystem.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingsRepository extends JpaRepository <Booking, Long>{

    List<Booking> findByDate(String date);
}
