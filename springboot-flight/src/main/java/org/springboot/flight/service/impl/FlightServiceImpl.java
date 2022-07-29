package org.springboot.flight.service.impl;

import java.util.List;

import org.springboot.flight.exception.ResourceNotFoundException;
import org.springboot.flight.model.Flight;
import org.springboot.flight.repository.FlightRepository;
import org.springboot.flight.service.FlightService;
import org.springframework.stereotype.Service;

@Service
public class FlightServiceImpl implements FlightService {

	// Data variable
	private FlightRepository flightRepository;

	// constructor
	public FlightServiceImpl(FlightRepository flightRepository) {
		super();
		this.flightRepository = flightRepository;
	}

	// save details
	@Override
	public Flight saveFlight(Flight flight) {
		return flightRepository.save(flight);
	}

	// get all details
	@Override
	public List<Flight> getAllFlights() {
		return flightRepository.findAll();
	}

	// get sepecific details
	@Override
	public Flight getFlightById(int Id) {
//		Optional<Flight> Flight = FlightRepository.findById(Id);
//		if(Flight.isPresent()) {
//			return Flight.get();	
//			}else {
//				throw new ResourceNotFoundException("Flight","Id",Id);
//			}
		return flightRepository.findById(Id).orElseThrow(() -> new ResourceNotFoundException("Flight", "Id", Id));

	}

	// update details
	@Override
	public Flight updateFlight(Flight flight, int Id) {
		Flight existingFlight = flightRepository.findById(Id)
				.orElseThrow(() -> new ResourceNotFoundException("Flight", "Id", Id));
		existingFlight.setCarrierName(flight.getCarrierName());
		existingFlight.setFlightModel(flight.getFlightModel());
		existingFlight.setSeatCapacity(flight.getSeatCapacity());
		flightRepository.save(existingFlight);
		return existingFlight;
	}

	// delete details
	@Override
	public void deleteFlight(int Id) {
		Flight existFlight = flightRepository.findById(Id)
				.orElseThrow(() -> new ResourceNotFoundException("Flight", "Id", Id));
		flightRepository.delete(existFlight);
	}
}
