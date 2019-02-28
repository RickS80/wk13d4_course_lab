package com.example.bookingSystem.repositories.CourseRepositories;

import com.example.bookingSystem.models.Course;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Transactional

public class CourseRepositoryImpl implements CourseRepositoryCustom {

    @Autowired
    EntityManager entityManager;

    public List<Course> getCoursesByCustomerID(Long id){
        List <Course> result = null;

        Session session = entityManager.unwrap(Session.class);
        Criteria cr = session.createCriteria(Course.class);
        cr.createAlias("bookings", "bookingAlias");
        cr.createAlias("bookingAlias.customer", "customerAlias");
        cr.add(Restrictions.eq("customerAlias.id", id));

        result = cr.list();

        return result;

    }
    // Get all courses for a given customer


}
