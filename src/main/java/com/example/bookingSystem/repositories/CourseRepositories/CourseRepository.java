package com.example.bookingSystem.repositories.CourseRepositories;

import com.example.bookingSystem.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface CourseRepository extends JpaRepository<Course, Long>, CourseRepositoryCustom {
// Get all courses with a given rating
    List<Course> getCoursesByStarRating(int starRating);

    List<Course> getCoursesByCustomerID(Long id);

}
