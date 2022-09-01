package com.airportservice.service;

import java.util.List;

import com.airportservice.model.Airport;

public interface AirportService {

	 //abstract method to get airport by schedule id
	public List<Airport> getAirportToSchedule(Long scheduleId);
	
}
