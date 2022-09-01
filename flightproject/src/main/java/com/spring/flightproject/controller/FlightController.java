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

import com.spring.flightproject.models.Flight;
import com.spring.flightproject.service.FlightService;

@RestController
@RequestMapping("/api/Flight")
public class FlightController {
	@Autowired
	private FlightService flightService;
	
	public FlightController(FlightService flightService) {
		super();
		this.flightService= flightService;
	}
	
	// build create Flight rest api
	@PostMapping()
	public ResponseEntity<Flight> saveFlight(@RequestBody Flight flight){
		return new ResponseEntity<Flight>(flightService.saveFlight(flight), HttpStatus.CREATED);
	}
	
	// build a method to get Flights 
    @GetMapping()
	public  List<Flight> getAllFlights(){
		return flightService.getAllFlights();
	}
    
    // Build method to get single Flight
    @GetMapping("/{id}")
    public ResponseEntity<Flight> getFlightById(@PathVariable("id") int Id){
    	return new ResponseEntity<Flight>(flightService.getFlightById(Id), HttpStatus.OK);
    }
    
    // Build method to update a specific Flight details
    @PutMapping("/{id}")
    public ResponseEntity<Flight> updateFlight(@PathVariable("id") int Id, @RequestBody Flight flight){
    	return new ResponseEntity<Flight>(flightService.updateFlight(flight,Id), HttpStatus.OK);
    }
    
    // Build Method to delete specific Flight details 
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteFlight(@PathVariable("id") int Id){
    	flightService.deleteFlight(Id);
    	return new ResponseEntity<String>("Flight record delete ", HttpStatus.OK);
    }
 
}
