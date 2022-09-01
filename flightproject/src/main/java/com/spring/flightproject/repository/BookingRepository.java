package com.spring.flightproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.flightproject.models.Booking;

public interface BookingRepository extends JpaRepository<Booking,Integer> {

}
