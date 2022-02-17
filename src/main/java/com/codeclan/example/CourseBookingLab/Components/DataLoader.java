package com.codeclan.example.CourseBookingLab.Components;

import com.codeclan.example.CourseBookingLab.models.Booking;
import com.codeclan.example.CourseBookingLab.models.Course;
import com.codeclan.example.CourseBookingLab.models.Customer;
import com.codeclan.example.CourseBookingLab.repositories.BookingRepository;
import com.codeclan.example.CourseBookingLab.repositories.CourseRepository;
import com.codeclan.example.CourseBookingLab.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.awt.print.Book;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CourseRepository courseRepository;

    public DataLoader(){
    }

    public void run(ApplicationArguments args){

        Customer sacha = new Customer("Sacha", "Dunbar", 37);
        customerRepository.save(sacha);

        Customer adam = new Customer("Adam", "Edinburgh", 24);
        customerRepository.save(adam);

        Customer tony = new Customer("Tony", "Glasgow", 34);
        customerRepository.save(tony);

        Course java = new Course("Java for Beginners", "Glasgow", 2);
        courseRepository.save(java);

        Course python = new Course("Advanced Python", "Edinburgh", 5);
        courseRepository.save(python);

        Booking booking1 = new Booking("12/12/20", python, adam);
        bookingRepository.save(booking1);

        Booking booking2 = new Booking("25/12/24", java, sacha);
        bookingRepository.save(booking2);

        Booking booking3 = new Booking("5/6/22", java, tony);
        bookingRepository.save(booking3);
    }
}
