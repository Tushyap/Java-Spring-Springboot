package com.airportservice.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.airportservice.model.Airport;
import com.airportservice.service.AirportService;




@RestController
@RequestMapping("/airport")
public class AirportController {
	
	@Autowired
	private AirportService airportService;
	
	// method returns schedule details by Id - we can get data on server 
	 @GetMapping("/schedule/{scheduleId}")
	public List<Airport> getAirportsDetails(@PathVariable("scheduleId") Long scheduleId){	
		return this.airportService.getAirportToSchedule(scheduleId);
	}

}
