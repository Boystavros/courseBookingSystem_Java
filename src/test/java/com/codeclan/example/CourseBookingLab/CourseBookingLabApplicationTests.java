package com.codeclan.example.CourseBookingLab;

import com.codeclan.example.CourseBookingLab.repositories.BookingRepository;
import com.codeclan.example.CourseBookingLab.repositories.CourseRepository;
import com.codeclan.example.CourseBookingLab.repositories.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CourseBookingLabApplicationTests {

	@Autowired
	CourseRepository courseRepository;

	@Autowired
	BookingRepository bookingRepository;

	@Autowired
	CustomerRepository customerRepository;

	@Test
	void contextLoads() {
	}

}
