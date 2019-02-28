package com.example.bookingSystem.controllers;

import com.example.bookingSystem.models.Customer;
import com.example.bookingSystem.repositories.CustomerRepositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customers")

public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping(value = "/courses/{id}")
    public List<Customer> getCustomersByCourseID(@PathVariable Long id){
        return customerRepository.getCustomersByCourseId(id);
    }

    @GetMapping(value = "/town/{town}/course/{id}")
    public List<Customer> getCustomersByTownAndByCourseID(@PathVariable String town, @PathVariable Long id){
        return customerRepository.getCustomersByTownAndByCourseID(town, id);
    }

    @GetMapping(value = "/town/{townName}/course/{courseId}/age/{age}")
    public List<Customer> getCustomersByTownAndByCourseIDOverCertainAge(@PathVariable String townName, @PathVariable Long courseId, @PathVariable int age){
        townName = townName.toLowerCase();
        return customerRepository.getCustomersByTownAndByCourseIDOverCertainAge(townName, courseId, age);
    }


}
