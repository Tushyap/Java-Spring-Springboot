package com.spring.flightproject.service;

import java.util.List;

import com.spring.flightproject.models.Flight;

public interface FlightService {

	Flight saveFlight(Flight flight);
	
	List<Flight> getAllFlights();
	
	// get sepecific Flight by Id
	Flight getFlightById(int Id);
	
	// update sepecific Flight by Id
	Flight updateFlight(Flight Flight, int Id);
	
	// delete sepecific Flight by Id
	void deleteFlight(int Id);
}
