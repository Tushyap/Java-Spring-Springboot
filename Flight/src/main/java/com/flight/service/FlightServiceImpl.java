package com.flight.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flight.entity.Flight;
import com.flight.repository.FlightRepository;
@Service
public class FlightServiceImpl implements FlightService{
	
	@Autowired
	private FlightRepository flightRepository;
	@Override
	public List<Flight> getAllFlights() {
		// TODO Auto-generated method stub
		return flightRepository.findAll();
	}

	@Override
	public Flight getFlightById(Long Id) {
		// TODO Auto-generated method stub
		return flightRepository.findById(Id).get();
	}

	@Override
	public Flight saveFlight(Flight flight) {
		// TODO Auto-generated method stub
		return flightRepository.save(flight);
	}

	


	

	

	

	
}
