package com.airport.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airport.entity.Airport;
import com.airport.repository.AirportRepository;

@Service
public class AirportServiceImpl implements AirportService {

	@Autowired
	private AirportRepository airportRepository;

	@Override
	public Airport saveAirport(Airport airport) {
		return airportRepository.save(airport);
	}

	@Override
	public List<Airport> showAllAirport() {

		return airportRepository.findAll();
	}

	@Override
	public Optional<Airport> showAirportById(Long Id) {

		return airportRepository.findById(Id);
	}

//	@Override
//	public Airport updateAirport(Long Id, Airport airport) {
//		Airport airportObj = airportRepository.findById(Id).get();
//		airportObj.setAirportId(airport.getAirportId());
//		airportObj.setAirportName(airport.getAirportName());
//		airportObj.setAirportLocation(airport.getAirportLocation());
//		airportObj.setAirportCode(airport.getAirportCode());
//		return airportRepository.save(airportObj);
//	}

	@Override
	public Airport updateAirport(Airport airport) {
		
		return airportRepository.save(airport);
	}

	@Override
	public void deleteAirport(Airport airport) {
		airportRepository.delete(airport);
		
	}

	
}
