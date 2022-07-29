package org.springboot.flight.controller;

import java.util.List;

import org.springboot.flight.model.Passenger;
import org.springboot.flight.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/passenger")
public class PassengerController {
	@Autowired
	private PassengerService passengerService;

	// constructor
	public PassengerController(PassengerService passengerService) {
		super();
		this.passengerService = passengerService;
	}

	// build create Flight rest api
	@PostMapping()
	public ResponseEntity<Passenger> savePassenger(@RequestBody Passenger passenger) {
		return new ResponseEntity<Passenger>(passengerService.savePassenger(passenger), HttpStatus.CREATED);
	}

	// build a method to get Flights
	@GetMapping()
	public List<Passenger> getAllPassengers() {
		return passengerService.getAllPassengers();
	}

	// Build method to get single Flight
	@GetMapping("/{id}")
	public ResponseEntity<Passenger> getPassenger(@PathVariable("id") int Id) {
		return new ResponseEntity<Passenger>(passengerService.getPassenger(Id), HttpStatus.OK);
	}

	// Build method to update a specific Flight details
	@PutMapping("/{id}")
	public ResponseEntity<Passenger> updatePassenger(@PathVariable("id") int Id, @RequestBody Passenger passenger) {
		return new ResponseEntity<Passenger>(passengerService.updatePassenger(passenger, Id), HttpStatus.OK);
	}

	// Build Method to delete specific Flight details
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteFlight(@PathVariable("id") int Id) {
		passengerService.deletePassenger(Id);
		return new ResponseEntity<String>("Passenger record delete ", HttpStatus.OK);
	}

}
