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

import com.spring.flightproject.models.Airport;
import com.spring.flightproject.service.AirportService;

@RestController
@RequestMapping("/api/Airport")
public class AirportController {
	@Autowired
	private AirportService airportService;
	
	public AirportController(AirportService airportService) {
		super();
		this.airportService= airportService;
	}
	
	// build create Airport rest api
	@PostMapping()
	public ResponseEntity<Airport> saveAirport(@RequestBody Airport airport){
		return new ResponseEntity<Airport>(airportService.saveAirport(airport), HttpStatus.CREATED);
	}
	
	// build a method to get Airports 
    @GetMapping()
	public  List<Airport> getAllAirports(){
		return airportService.getAllAirports();
	}
    
    // Build method to get single Airport
    @GetMapping("/{id}")
    public ResponseEntity<Airport> getAirById(@PathVariable("id") int Id){
    	return new ResponseEntity<Airport>(airportService.getAirById(Id), HttpStatus.OK);
    }
    
    // Build method to update a specific Airport details
    @PutMapping("/{id}")
    public ResponseEntity<Airport> updateAirport(@PathVariable("id") int Id, @RequestBody Airport airport){
    	return new ResponseEntity<Airport>(airportService.updateAirport(airport,Id), HttpStatus.OK);
    }
    
    // Build Method to delete specific Airport details 
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteAirport(@PathVariable("id") int Id){
    	airportService.deleteAirport(Id);
    	return new ResponseEntity<String>("Airport record delete ", HttpStatus.OK);
    }
}
