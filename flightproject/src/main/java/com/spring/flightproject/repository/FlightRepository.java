package com.spring.flightproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.flightproject.models.Flight;

public interface FlightRepository extends JpaRepository<Flight ,Integer>{

}
