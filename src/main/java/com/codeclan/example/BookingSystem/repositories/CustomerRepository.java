package com.codeclan.example.BookingSystem.repositories;

import com.codeclan.example.BookingSystem.models.Course;
import com.codeclan.example.BookingSystem.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    List<Customer> findByBookingsCourseName(String name);
    List<Customer> findByBookingsCourseNameAndTown(String courseName, String town);
    List<Customer> findByBookingsCourseNameAndTownIgnoreCaseAndAge(String courseName, String town, int age);
}
