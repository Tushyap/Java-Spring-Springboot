package com.airport.service;



import java.util.List;
import java.util.Optional;

import com.airport.entity.Airport;

public interface AirportService {

	public Airport saveAirport(Airport airport);

	public List<Airport> showAllAirport();

	public Optional<Airport> showAirportById(Long Id);
	
//	public Airport updateAirport(Long Id,Airport airport);
	public Airport updateAirport(Airport airport);
	
	public void deleteAirport(Airport airport);
}
