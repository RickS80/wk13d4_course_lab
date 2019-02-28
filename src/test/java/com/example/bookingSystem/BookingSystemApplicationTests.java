package com.example.bookingSystem;

import com.example.bookingSystem.models.Course;
import com.example.bookingSystem.repositories.CourseRepositories.CourseRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BookingSystemApplicationTests {

	@Autowired
	CourseRepository courseRepository;

	@Test
	public void contextLoads() {
	}


	@Test
	public void canGetCoursesByRating(){


		List<Course> result = courseRepository.getCoursesByStarRating(4);

	}

}
