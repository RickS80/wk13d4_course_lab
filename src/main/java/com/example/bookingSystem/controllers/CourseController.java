package com.example.bookingSystem.controllers;

import com.example.bookingSystem.models.Course;
import com.example.bookingSystem.repositories.CourseRepositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @GetMapping(value = "/starRating/{starRating}")
    public List<Course> getCoursesByStarRating(@PathVariable int starRating){
        return courseRepository.getCoursesByStarRating(starRating);
    }


}
