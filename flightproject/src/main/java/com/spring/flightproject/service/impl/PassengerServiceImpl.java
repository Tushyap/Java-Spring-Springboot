package com.spring.flightproject.service.impl;

import com.spring.flightproject.exception.ResourceNotFoundException;
import com.spring.flightproject.models.Passenger;
import com.spring.flightproject.repository.PassengerRepository;
import com.spring.flightproject.service.PassengerService;

import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class PassengerServiceImpl implements PassengerService {
private PassengerRepository passengerRepository;
	
	public PassengerServiceImpl(PassengerRepository passengerRepository) {
		super();
		this.passengerRepository=passengerRepository;
	}

	@Override
	public Passenger savePassenger(Passenger passenger) {
		return  passengerRepository.save(passenger);
	}

	@Override
	public List<Passenger> getAllPassengers() {	
		return passengerRepository.findAll();
	}

	@Override
	public Passenger getPasById(int Id) {

		return  passengerRepository.findById(Id).orElseThrow( 
				()-> new ResourceNotFoundException ("Passenger","Id",Id));
			
	}

	@Override
	public Passenger updatePassenger(Passenger Passenger, int Id) {
		Passenger existingPassenger = passengerRepository.findById(Id).orElseThrow( 
				()-> new ResourceNotFoundException ("Passenger","Id",Id));
		existingPassenger.setPnrNumber(Passenger.getPnrNumber());
		existingPassenger.setPassengerName(Passenger.getPassengerName());
		existingPassenger.setPassengerAge(Passenger.getPassengerAge());
		existingPassenger.setPassengerUIN(Passenger.getPassengerUIN());
		existingPassenger.setLuggage(Passenger.getLuggage());
		
		passengerRepository.save(existingPassenger);
		return existingPassenger;
	}

	@Override
	public void deletePassenger(int Id) {
		Passenger existPassenger = passengerRepository.findById(Id).orElseThrow( 
				()-> new ResourceNotFoundException ("Passenger","Id",Id));
		passengerRepository.delete(existPassenger);
	}


}
