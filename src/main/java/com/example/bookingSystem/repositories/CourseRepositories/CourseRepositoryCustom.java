package com.example.bookingSystem.repositories.CourseRepositories;


import com.example.bookingSystem.models.Course;

import java.util.List;

public interface CourseRepositoryCustom {

    List<Course> getCoursesByCustomerID(Long id);
}
