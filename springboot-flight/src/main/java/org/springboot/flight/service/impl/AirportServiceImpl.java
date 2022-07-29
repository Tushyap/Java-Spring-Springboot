package org.springboot.flight.service.impl;

import java.util.List;

import org.springboot.flight.model.Airport;
import org.springboot.flight.repository.AirportRepository;
import org.springboot.flight.service.AirportService;
import org.springframework.stereotype.Service;

@Service
public class AirportServiceImpl implements AirportService{

	private AirportRepository airportRepo;
	
	public AirportServiceImpl(AirportRepository airportRepo) {
		super();
		this.airportRepo = airportRepo;
	}

	@Override
	public Airport saveAirport(Airport airport) {
		return airportRepo.save(airport);
	}

	@Override
	public List<Airport> getAllAirport() {
		return airportRepo.findAll();
	}

}
