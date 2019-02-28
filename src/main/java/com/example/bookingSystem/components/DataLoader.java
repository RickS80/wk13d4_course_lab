package com.example.bookingSystem.components;

import com.example.bookingSystem.models.Booking;
import com.example.bookingSystem.models.Course;
import com.example.bookingSystem.models.Customer;
import com.example.bookingSystem.repositories.BookingRepositories.BookingRepository;
import com.example.bookingSystem.repositories.CourseRepositories.CourseRepository;
import com.example.bookingSystem.repositories.CustomerRepositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;

    public DataLoader(){
}

    public void run(ApplicationArguments args){
        Course course1 = new Course("coding", "edinburgh", 4);
        courseRepository.save(course1);
        Customer customer1 = new Customer("Steve","edinburgh", 35);
        customerRepository.save(customer1);
        Booking booking1 = new Booking("28-02-19", course1, customer1);
        bookingRepository.save(booking1);

        Course course2 = new Course("engineering", "glasgow", 2);
        courseRepository.save(course2);
        Customer customer2 = new Customer("Sharon","edinburgh", 24);
        customerRepository.save(customer2);
        Booking booking2 = new Booking("28-01-19", course2, customer2);
        bookingRepository.save(booking2);

        Course course3 = new Course("design", "london", 5);
        courseRepository.save(course3);
        Customer customer3 = new Customer("Kevin","edinburgh", 56);
        customerRepository.save(customer3);
        Booking booking3 = new Booking("28-03-19", course2, customer1);
        bookingRepository.save(booking3);

        Booking booking4 = new Booking("28-03-19", course2, customer3);
        bookingRepository.save(booking4);


    }

}
