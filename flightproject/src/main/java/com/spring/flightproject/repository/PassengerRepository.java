package com.spring.flightproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.flightproject.models.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger ,Integer> {

}
