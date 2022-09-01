package com.scheduleservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.scheduleservice.model.Schedule;
import com.scheduleservice.service.ScheduleService;

@RestController
@RequestMapping("/schedule")
public class ScheduleController {

	//Marks a constructor, field, setter method, or config method as to be autowired by Spring's dependency injection facilities.
	@Autowired 
	private ScheduleService scheduleService;

	@Autowired
	private RestTemplate restTemplate;

	// method - returns schedule object 
	@GetMapping("/{scheduleId}/{scheduleIdTwo}")
	public Schedule getSchedule(@PathVariable("scheduleId") Long scheduleId, @PathVariable("scheduleIdTwo") Long scheduleIdTwo) {
		Schedule schedule = this.scheduleService.getSchedule(scheduleId);
        Schedule scheduleTwo= this.scheduleService.getSchedule(scheduleIdTwo);
		List airports = this.restTemplate.getForObject("http://airport-service/airport/schedule/" + schedule.getScheduleId(), List.class);
		List airportTwo =this.restTemplate.getForObject("http://airport-service/airport/schedule/" + scheduleTwo.getScheduleId(), List.class);
		schedule.setSourceAirport(airports);
		schedule.setDestinationAirport(airportTwo);
		return schedule;
	}

}
