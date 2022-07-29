package org.springboot.flight.repository;

import org.springboot.flight.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight ,Integer> {

}
