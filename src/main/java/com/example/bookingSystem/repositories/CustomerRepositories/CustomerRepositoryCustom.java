package com.example.bookingSystem.repositories.CustomerRepositories;

import com.example.bookingSystem.models.Customer;

import java.util.List;

public interface CustomerRepositoryCustom {
    //  Get all customers for a given course
    List<Customer> getCustomersByCourseId(Long id);

    List<Customer> getCustomersByTownAndByCourseID(String customerTown, Long courseId);
}
