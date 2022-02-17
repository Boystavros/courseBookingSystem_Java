package com.codeclan.example.CourseBookingLab.repositories;

import com.codeclan.example.CourseBookingLab.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
}
