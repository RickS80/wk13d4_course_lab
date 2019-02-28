package com.example.bookingSystem.repositories.BookingRepositories;

import com.example.bookingSystem.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long>, BookingRepositoryCustom {

    List<Booking> getBookingsByDate(String date);
}
