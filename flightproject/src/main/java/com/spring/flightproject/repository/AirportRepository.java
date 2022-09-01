package com.spring.flightproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.flightproject.models.Airport;

public interface AirportRepository extends JpaRepository<Airport ,Integer>{

}
