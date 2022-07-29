package org.springboot.flight.service;

import java.util.List;

import org.springboot.flight.model.Passenger;

public interface PassengerService {
	// save records of passsenger
	Passenger savePassenger(Passenger passenger);

	// Get all passengers details
	List<Passenger> getAllPassengers();

	// get sepecific passenger by Id
	Passenger getPassenger(int Id);

	// update sepecific passenger by Id
	Passenger updatePassenger(Passenger passenger, int Id);

	// delete sepecific passenger by Id
	void deletePassenger(int Id);

}
