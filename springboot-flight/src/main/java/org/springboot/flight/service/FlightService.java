package org.springboot.flight.service;

import java.util.List;

import org.springboot.flight.model.Flight;

public interface FlightService {
	// save the flight details
	Flight saveFlight(Flight flight);

	// get all flights details
	List<Flight> getAllFlights();

	// get sepecific Flight by Id
	Flight getFlightById(int Id);

	// update sepecific Flight by Id
	Flight updateFlight(Flight flight, int Id);

	// delete sepecific Flight by Id
	void deleteFlight(int Id);

}
