package com.airport.service;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airport.entity.Airport;
import com.airport.repository.AirportRepository;
@Service
public class AirportServiceImpl implements AirportService{

		@Autowired
		private AirportRepository airportRepository;


	@Override
	public Airport saveAirport(Airport airport) {
		return airportRepository.save(airport);
		
	}


	@Override
	public List<Airport> showAllAirport() {
		// TODO Auto-generated method stub
		return airportRepository.findAll();
	}


	@Override
	public Optional<Airport> showAirportById(Long Id) {
		// TODO Auto-generated method stub
		return airportRepository.findById(Id);
	}


	@Override
	public Airport updateAirport(Airport airport) {
		// TODO Auto-generated method stub
		return airportRepository.save(airport);
	}


}
