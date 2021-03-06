package com.codeclan.example.CourseBookingLab.Controllers;

import com.codeclan.example.CourseBookingLab.models.Course;
import com.codeclan.example.CourseBookingLab.repositories.CourseRepository;
import com.fasterxml.classmate.members.ResolvedParameterizedMember;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @GetMapping(value = "/courses")
    public ResponseEntity<List<Course>> getAllCourses(
            @RequestParam(name = "rating", required = false) Integer starRating,
            @RequestParam(name = "customer", required = false) String customerName
    ){
        if(starRating != null){
            return new ResponseEntity(courseRepository.findByStarRating(starRating), HttpStatus.OK);
        }
        else if(customerName != null){
            return new ResponseEntity(courseRepository.findByBookingsCustomerName(customerName), HttpStatus.OK);
        }
        return new ResponseEntity(courseRepository.findAll(), HttpStatus.OK);
    }
}
