package org.springboot.flight.service.impl;

import java.util.List;

import org.springboot.flight.exception.ResourceNotFoundException;
import org.springboot.flight.model.Passenger;
import org.springboot.flight.repository.PassengerRepository;
import org.springboot.flight.service.PassengerService;
import org.springframework.stereotype.Service;
@Service
public class PassengerServiceImpl implements PassengerService{
	
	private PassengerRepository passengerRepo;
	public PassengerServiceImpl(PassengerRepository passengerRepo) {
		super();
		this.passengerRepo = passengerRepo;
	}

	@Override
	public Passenger savePassenger(Passenger passenger) {
		return passengerRepo.save(passenger);		
	}

	@Override
	public List<Passenger> getAllPassengers() {
		return passengerRepo.findAll();
	}

	@Override
	public Passenger getPassenger(int Id) {
		return passengerRepo.findById(Id).orElseThrow( 
					()-> new ResourceNotFoundException ("Passenger","Id",Id));
	}

	@Override
	public Passenger updatePassenger(Passenger passenger, int Id) {

		Passenger passengerObj = passengerRepo.findById(Id).orElseThrow( 
				()-> new ResourceNotFoundException ("Passenger","Id",Id));
		passengerObj.setPnrNumber(passenger.getPnrNumber());
		passengerObj.setPassengerName(passenger.getPassengerName());
		passengerObj.setPassengerAge(passenger.getPassengerAge());
		passengerObj.setPassengerUIN(passenger.getPassengerUIN());
		passengerObj.setLuggage(passenger.getLuggage());
		passengerRepo.save(passenger);
		return passengerObj;
	}

	@Override
	public void deletePassenger(int Id) {
		Passenger passengerObj = passengerRepo.findById(Id).orElseThrow( 
				()-> new ResourceNotFoundException ("Passenger","Id",Id));
		passengerRepo.delete(passengerObj);
		
	}

}
