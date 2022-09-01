package com.spring.flightproject.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.flightproject.exception.ResourceNotFoundException;
import com.spring.flightproject.models.Airport;
import com.spring.flightproject.repository.AirportRepository;
import com.spring.flightproject.service.AirportService;

@Service
public class AirportServiceImpl implements AirportService{
private AirportRepository airportRepository;
	
	public AirportServiceImpl(AirportRepository airportRepository) {
		super();
		this.airportRepository=airportRepository;
	}

	@Override
	public Airport saveAirport(Airport airport) {
		return  airportRepository.save(airport);
	}

	@Override
	public List<Airport> getAllAirports() {	
		return airportRepository.findAll();
	}

	@Override
	public Airport getAirById(int Id) {
//		Optional<Airport> Airport = AirportRepository.findById(Id);
//		if(Airport.isPresent()) {
//			return Airport.get();	
//			}else {
//				throw new ResourceNotFoundException("Airport","Id",Id);
//			}
		return  airportRepository.findById(Id).orElseThrow( 
				()-> new ResourceNotFoundException ("Airport","Id",Id));
			
	}

	@Override
	public Airport updateAirport(Airport airport, int Id) {
		Airport existingAirport = airportRepository.findById(Id).orElseThrow( 
				()-> new ResourceNotFoundException ("Airport","Id",Id));
		existingAirport.setAirportId(airport.getAirportId());
		existingAirport.setAirportName(airport.getAirportName());
		existingAirport.setAirportLocation(airport.getAirportLocation());
		existingAirport.setAirportCode(airport.getAirportCode());
		
		airportRepository.save(existingAirport);
		return existingAirport;
	}

	@Override
	public void deleteAirport(int Id) {
		Airport existAirport = airportRepository.findById(Id).orElseThrow( 
				()-> new ResourceNotFoundException ("Airport","Id",Id));
		airportRepository.delete(existAirport);
	}


}
