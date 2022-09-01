package com.flight.service;

import java.util.List;

import com.flight.entity.Flight;
	

public interface FlightService {

	
	List<Flight> getAllFlights();
	
	// get sepecific Flight by Id
	Flight getFlightById(Long Id);
	
	// update sepecific Flight by Id
	Flight saveFlight(Flight flight);
}
