package com.flight.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.flight.entity.Flight;
import com.flight.service.FlightService;



@RestController
@RequestMapping("Flight")
public class FlightController {
	@Autowired
	private FlightService flightService;
	
	public FlightController(FlightService flightService) {
		super();
		this.flightService= flightService;
	}
	

	
	// build a method to get Flights 
    @GetMapping("/get")
	public  List<Flight> getAllFlights(){
		return flightService.getAllFlights();
	}
    
    // Build method to get single Flight
    @GetMapping("/get/{id}")
    public Flight getFlightById(@PathVariable("id") Long Id){
    	return flightService.getFlightById(Id);
    }
    @PostMapping("/save")
    public Flight getSchById(@RequestBody Flight flight){
    	return flightService.saveFlight(flight);
    }

    

 
}
