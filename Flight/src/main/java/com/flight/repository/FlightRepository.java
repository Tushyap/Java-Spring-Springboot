package com.flight.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flight.entity.Flight;

public interface FlightRepository extends JpaRepository<Flight,Long>{

}
