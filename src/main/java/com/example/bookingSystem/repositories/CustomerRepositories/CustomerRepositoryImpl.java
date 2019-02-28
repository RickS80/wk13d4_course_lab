package com.example.bookingSystem.repositories.CustomerRepositories;

import com.example.bookingSystem.models.Customer;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Transactional
public class CustomerRepositoryImpl implements CustomerRepositoryCustom{

    @Autowired
    EntityManager entityManager;

    @Override
    public List<Customer> getCustomersByCourseId(Long id) {
        List<Customer> result = null;

        Session session = entityManager.unwrap(Session.class);

        Criteria cr = session.createCriteria(Customer.class);
        cr.createAlias("bookings", "bookingAlias");
        cr.createAlias("bookingAlias.course", "courseAlias");
        cr.add(Restrictions.eq("courseAlias.id", id));

        result = cr.list();
        return result;
    }
}
