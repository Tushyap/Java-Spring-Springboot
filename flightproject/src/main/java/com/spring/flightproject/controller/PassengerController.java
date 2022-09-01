package com.spring.flightproject.controller;

import java.util.List;

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

import com.spring.flightproject.models.Passenger;
import com.spring.flightproject.service.PassengerService;

@RestController
@RequestMapping("/api/Passenger")
public class PassengerController {

	@Autowired
	private PassengerService passengerService;
	
	public PassengerController(PassengerService passengerService) {
		super();
		this.passengerService= passengerService;
	}
	
	// build create Passenger rest api
	@PostMapping()
	public ResponseEntity<Passenger> savePassenger(@RequestBody Passenger passenger){
		return new ResponseEntity<Passenger>(passengerService.savePassenger(passenger), HttpStatus.CREATED);
	}
	
	// build a method to get Passengers 
    @GetMapping()
	public  List<Passenger> getAllPassengers(){
		return passengerService.getAllPassengers();
	}
    
    // Build method to get single Passenger
    @GetMapping("/{id}")
    public ResponseEntity<Passenger> getEmpById(@PathVariable("id") int Id){
    	return new ResponseEntity<Passenger>(passengerService.getPasById(Id), HttpStatus.OK);
    }
    
    // Build method to update a specific Passenger details
    @PutMapping("/{id}")
    public ResponseEntity<Passenger> updatePassenger(@PathVariable("id") int Id, @RequestBody Passenger passenger){
    	return new ResponseEntity<Passenger>(passengerService.updatePassenger(passenger,Id), HttpStatus.OK);
    }
    
    // Build Method to delete specific Passenger details 
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePassenger(@PathVariable("id") int Id){
    	passengerService.deletePassenger(Id);
    	return new ResponseEntity<String>("Passenger record delete ", HttpStatus.OK);
    }
}
