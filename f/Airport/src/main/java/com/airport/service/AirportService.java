package com.airport.service;



import java.util.List;
import java.util.Optional;

import com.airport.entity.Airport;

public interface AirportService {
	
	public List<Airport> showAllAirport();
	public Optional<Airport> showAirportById(Long Id);
	public Airport saveAirport(Airport airport);
	public Airport updateAirport(Airport airport);
}
