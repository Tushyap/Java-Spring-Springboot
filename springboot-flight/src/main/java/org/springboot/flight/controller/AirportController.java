package org.springboot.flight.controller;

import java.util.List;

import org.springboot.flight.model.Airport;
import org.springboot.flight.service.AirportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/airport")
public class AirportController {
	
	@Autowired
	private AirportService airportService;

	//constructor
	public AirportController(AirportService airportService) {
		super();
		this.airportService = airportService;
	}
	
	// build create Flight rest api
	@PostMapping()
	public ResponseEntity<Airport> saveFlight(@RequestBody Airport airport){
		return new ResponseEntity<Airport>(airportService.saveAirport(airport), HttpStatus.CREATED);
	}
	
	// build a method to get Flights 
    @GetMapping()
	public  List<Airport> getAllAirports(){
		return airportService.getAllAirport();
	}
	

}
