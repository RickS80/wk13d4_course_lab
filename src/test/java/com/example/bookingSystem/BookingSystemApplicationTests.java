package com.example.bookingSystem;

import com.example.bookingSystem.models.Booking;
import com.example.bookingSystem.models.Course;
import com.example.bookingSystem.models.Customer;
import com.example.bookingSystem.repositories.BookingRepositories.BookingRepository;
import com.example.bookingSystem.repositories.CourseRepositories.CourseRepository;
import com.example.bookingSystem.repositories.CustomerRepositories.CustomerRepository;
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

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	BookingRepository bookingRepository;

	@Test
	public void contextLoads() {
	}


	@Test
	public void canGetCoursesByRating(){
		List<Course> result = courseRepository.getCoursesByStarRating(4);
	}

	@Test
	public void canGetCustomersByCourseId(){
		List<Customer> result = customerRepository.getCustomersByCourseId(2L);
	}

	@Test
	public void canGetCoursesbyCustomerId(){
		List<Course> result = courseRepository.getCoursesByCustomerID(1L);
	}

	@Test
	public void canGetBookingsByDate(){
		List<Booking> result = bookingRepository.getBookingsByDate("28-02-19");
	}

	@Test
	public void canGetCustomersByTownAndByCourseID(){
		List<Customer> result = customerRepository.getCustomersByTownAndByCourseID("edinburgh", 2L);
	}

	@Test
	public void canGetCustomersByTownAndCourseIDOverACertainAge(){
		List<Customer> result = customerRepository.getCustomersByTownAndByCourseIDOverCertainAge("edinburgh",2L, 30);
	}



}
