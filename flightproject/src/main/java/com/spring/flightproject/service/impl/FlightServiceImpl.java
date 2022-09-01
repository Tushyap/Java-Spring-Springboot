package com.spring.flightproject.service.impl;

import com.spring.flightproject.exception.ResourceNotFoundException;
import com.spring.flightproject.models.Flight;
import com.spring.flightproject.repository.FlightRepository;
import com.spring.flightproject.service.FlightService;

import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class FlightServiceImpl implements FlightService{
private FlightRepository flightRepository;
	
	public FlightServiceImpl(FlightRepository flightRepository) {
		super();
		this.flightRepository=flightRepository;
	}

	@Override
	public Flight saveFlight(Flight flight) {
		return  flightRepository.save(flight);
	}

	@Override
	public List<Flight> getAllFlights() {	
		return flightRepository.findAll();
	}

	@Override
	public Flight getFlightById(int Id) {
//		Optional<Flight> Flight = FlightRepository.findById(Id);
//		if(Flight.isPresent()) {
//			return Flight.get();	
//			}else {
//				throw new ResourceNotFoundException("Flight","Id",Id);
//			}
		return  flightRepository.findById(Id).orElseThrow( 
				()-> new ResourceNotFoundException ("Flight","Id",Id));
			
	}

	@Override
	public Flight updateFlight(Flight flight, int Id) {
		Flight existingFlight = flightRepository.findById(Id).orElseThrow( 
				()-> new ResourceNotFoundException ("Flight","Id",Id));
		existingFlight.setCarrierName(flight.getCarrierName());
		existingFlight.setFlightModel(flight.getFlightModel());
		existingFlight.setSeatCapacity(flight.getSeatCapacity());
		
		flightRepository.save(existingFlight);
		return existingFlight;
	}

	@Override
	public void deleteFlight(int Id) {
		Flight existFlight = flightRepository.findById(Id).orElseThrow( 
				()-> new ResourceNotFoundException ("Flight","Id",Id));
		flightRepository.delete(existFlight);
	}
}
