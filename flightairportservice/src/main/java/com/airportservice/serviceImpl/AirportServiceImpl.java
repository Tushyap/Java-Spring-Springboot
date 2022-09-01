package com.airportservice.serviceImpl;


import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import com.airportservice.model.Airport;
import com.airportservice.service.AirportService;

@Service
public class AirportServiceImpl implements AirportService{


	// list of airport
	List<Airport> lists = List.of(
			new Airport(1L, "Chennai International Airport","Chennai","CHE10",100L),
			new Airport(2L, "Mumbai International Airport","Mumbai","MUM11",101L),
			new Airport(3L, "New Delhi International Airport","New Delhi","NEW12",102L));

	// method- returns the list of airport by schedule id
	@Override
	public List<Airport> getAirportToSchedule(Long scheduleId) {	
		return lists.stream().filter(airport-> airport.getScheduleId().equals(scheduleId)).collect(Collectors.toList());
	}


}
