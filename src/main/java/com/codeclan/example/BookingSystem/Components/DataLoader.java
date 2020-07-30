package com.codeclan.example.BookingSystem.Components;


import com.codeclan.example.BookingSystem.models.Booking;
import com.codeclan.example.BookingSystem.models.Course;
import com.codeclan.example.BookingSystem.models.Customer;
import com.codeclan.example.BookingSystem.repositories.BookingsRepository;
import com.codeclan.example.BookingSystem.repositories.CourseRepository;
import com.codeclan.example.BookingSystem.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    BookingsRepository bookingsRepository;

    @Autowired
    CustomerRepository customerRepository;

    public DataLoader(){
    }

    public void run(ApplicationArguments args){
        Course course1 = new Course("Codeclan", "Stirling", 5);
        courseRepository.save(course1);

        Course course2 = new Course("McDonalds", "Glasgow", 1);
        courseRepository.save(course2);

        Customer customer1 = new Customer("Ronald McDonald", "Glasgow", 74);
        customerRepository.save(customer1);

        Customer customer2 = new Customer("Niall Morris", "Glasgow", 27);
        customerRepository.save(customer2);

        Booking booking1 = new Booking("25-12-19", customer1,course2 );
        bookingsRepository.save(booking1);

        Booking booking2 = new Booking("01-01-20", customer2,course1 );
        bookingsRepository.save(booking2);

        Booking booking3 = new Booking("30-07-20", customer2,course2 );
        bookingsRepository.save(booking3);

    }

}
