package org.springboot.flight.service;

import java.util.List;

import org.springboot.flight.model.Airport;

public interface AirportService {
	// save airport record
	Airport saveAirport(Airport airport);

	// get all airport record
	List<Airport> getAllAirport();
}
