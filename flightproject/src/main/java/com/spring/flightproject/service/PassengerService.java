package com.spring.flightproject.service;

import java.util.List;

import com.spring.flightproject.models.Passenger;

public interface PassengerService {

	Passenger savePassenger(Passenger passenger);

	List<Passenger> getAllPassengers();
	
	// get sepecific Passenger by Id
	Passenger getPasById(int Id);
	
	// update sepecific Passenger by Id
	Passenger updatePassenger(Passenger Passenger, int Id);
	
	// delete sepecific Passenger by Id
	void deletePassenger(int Id);
}
