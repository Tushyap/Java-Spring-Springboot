package com.spring.flightproject.service.impl;

import com.spring.flightproject.exception.ResourceNotFoundException;
import com.spring.flightproject.models.ScheduledFlight;
import com.spring.flightproject.repository.ScheduledFlightRepository;
import com.spring.flightproject.service.ScheduledFlightService;

import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class ScheduledFlightServiceImpl implements ScheduledFlightService{
	
	private ScheduledFlightRepository scheduledFlightRepository;
	public ScheduledFlightServiceImpl(ScheduledFlightRepository scheduledFlightRespository) {
		super();
		this.scheduledFlightRepository=scheduledFlightRespository;
	}

	@Override
	public ScheduledFlight saveScheduledFlight(ScheduledFlight scheduledFlight) {
		return  scheduledFlightRepository.save(scheduledFlight);
	}

	@Override
	public List<ScheduledFlight> getAllScheduledFlights() {	
		return scheduledFlightRepository.findAll();
	}

	@Override
	public ScheduledFlight getScheduledFlightById(int Id) {
		
		return  scheduledFlightRepository.findById(Id).orElseThrow( 
				()-> new ResourceNotFoundException ("ScheduledFlight","Id",Id));
			
	}

	@Override
	public ScheduledFlight updateScheduledFlight(ScheduledFlight scheduledFlight, int Id) {
		ScheduledFlight existingScheduledFlight = scheduledFlightRepository.findById(Id).orElseThrow( 
				()-> new ResourceNotFoundException ("ScheduledFlight","Id",Id));
		existingScheduledFlight.setScheduledFlightId(scheduledFlight.getScheduledFlightId());
		existingScheduledFlight.setFlight(scheduledFlight.getFlight());
		existingScheduledFlight.setAvailableSeats(scheduledFlight.getAvailableSeats());
		existingScheduledFlight.setSchedule(scheduledFlight.getSchedule());
		
		scheduledFlightRepository.save(existingScheduledFlight);
		return existingScheduledFlight;
	}

	@Override
	public void deleteScheduledFlight(int Id) {
		ScheduledFlight existScheduledFlight = scheduledFlightRepository.findById(Id).orElseThrow( 
				()-> new ResourceNotFoundException ("ScheduledFlight","Id",Id));
		scheduledFlightRepository.delete(existScheduledFlight);
	}


}
