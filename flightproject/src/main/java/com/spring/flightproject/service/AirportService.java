package com.spring.flightproject.service;

import java.util.List;

import com.spring.flightproject.models.Airport;

public interface AirportService {
	
	Airport saveAirport(Airport airport);
	
	List<Airport> getAllAirports();
	
	// get sepecific Airport by Id
	Airport getAirById(int Id);
	
	// update sepecific Airport by Id
	Airport updateAirport(Airport Airport, int Id);
	
	// delete sepecific Airport by Id
	void deleteAirport(int Id);
}
