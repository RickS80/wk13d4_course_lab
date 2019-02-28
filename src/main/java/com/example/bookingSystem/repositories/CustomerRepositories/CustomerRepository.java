package com.example.bookingSystem.repositories.CustomerRepositories;

import com.example.bookingSystem.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long>, CustomerRepositoryCustom {

    //  Get all customers for a given course
    List<Customer> getCustomersByCourseId(Long id);

    List<Customer> getCustomersByTownAndByCourseID(String customerTown, Long courseId);

    List<Customer> getCustomersByTownAndByCourseIDOverCertainAge(String customerTown, Long courseID, int age);
}
