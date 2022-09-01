package com.airport.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.airport.entity.Airport;
import com.airport.service.AirportService;

@RestController
@RequestMapping("/airport")
public class AirportController {
	@Autowired
	private AirportService airportService;

	public AirportController(AirportService airportService) {
		super();
		this.airportService = airportService;
	}

	// get all airport details
	@GetMapping("/show")
	public List<Airport> showAirport() {
		return airportService.showAllAirport();
	}

	// get specific airport details 
	@GetMapping("/show/{id}")
	public Airport showAirportById(@PathVariable("id") Long Id) {
		return airportService.showAirportById(Id).get();
	}

	// save airport details 
	@PostMapping("/save")
	public Airport saveAirport(@RequestBody Airport airport) {
		return airportService.saveAirport(airport);
	}
	
//	@PutMapping("/update/{id}")
//	public Airport updateAirportDetails(@PathVariable("id") Long Id, @RequestBody Airport airport) {
//		return airportService.updateAirport(Id, airport);
//	}

    @PutMapping("/update/{id}")
    public Airport updateAirportById(@PathVariable("id") Long Id,@RequestBody Airport airport) {
    	airport.setAirportId(Id);
    	return airportService.updateAirport(airport);
    }
    
    @DeleteMapping("/delete/{id}")
    public String deleteAirportDetails(@PathVariable("id") Long Id) {
    	Airport airport=airportService.showAirportById(Id).get();
    	airportService.deleteAirport(airport);
    	return "Airport Deleted";
    }
}
