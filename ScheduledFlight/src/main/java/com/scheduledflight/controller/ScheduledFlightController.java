package com.scheduledflight.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.scheduledflight.entity.Flight;
import com.scheduledflight.entity.ScheduleRequestResponse;
import com.scheduledflight.entity.ScheduledFlight;
import com.scheduledflight.entity.ScheduledFlightRequestResponse;
import com.scheduledflight.service.ScheduledFlightService;



@RestController
@RequestMapping("/scheduledflight")
public class ScheduledFlightController {
	@Autowired
	private ScheduledFlightService scheduledFlightService;
	@Autowired
	RestTemplate restTemplate;
	public ScheduledFlightController(ScheduledFlightService scheduledFlightService) {
		super();
		this.scheduledFlightService= scheduledFlightService;
	}
	
	
	// build a method to get ScheduledFlights 
    @GetMapping("/show/{id}")
	public  ScheduledFlightRequestResponse getAllScheduledFlights(@PathVariable("id") Long id){
		ScheduledFlight scheduledFlight =scheduledFlightService.getScheduledFlightById(id);
		ScheduleRequestResponse scheduleRequestResponse=this.restTemplate.getForObject("http://localhost:8111/schedule/get/"+scheduledFlight.getScheduleId(),ScheduleRequestResponse.class);
    	Flight flight=this.restTemplate.getForObject("http://localhost:8222/Flight/get/"+scheduledFlight.getFlightId(),Flight.class);    	
    	ScheduledFlightRequestResponse scheduledFlightRequestResponseTemp=new ScheduledFlightRequestResponse(scheduledFlight.getScheduledFlightId(),flight,scheduledFlight.getAvailableSeats(),scheduleRequestResponse);

    	return scheduledFlightRequestResponseTemp;
	}
    
    // Build method to get single ScheduledFlight
    @PostMapping("/save")
    public ResponseEntity<ScheduledFlightRequestResponse> getScheduledFlightById(@RequestBody ScheduledFlightRequestResponse scheduledFlightRequestResponse){

    	ScheduleRequestResponse scheduleRequestResponse=this.restTemplate.postForObject("http://localhost:8111/schedule/save",scheduledFlightRequestResponse.getScheduleRequestResponse(),ScheduleRequestResponse.class);
    	Flight flight=this.restTemplate.postForObject("http://localhost:8222/Flight/save",scheduledFlightRequestResponse.getFlight(),Flight.class);    	

    	ScheduledFlight scheduledFlight=new ScheduledFlight(scheduledFlightRequestResponse.getScheduledFlightId(),flight.getFlightId()
    			,scheduledFlightRequestResponse.getAvailableSeats(),scheduleRequestResponse.getScheduleId());
    	ScheduledFlight temp=scheduledFlightService.save(scheduledFlight);
    	ScheduledFlightRequestResponse scheduledFlightRequestResponseTemp=new ScheduledFlightRequestResponse(temp.getScheduledFlightId(),flight,temp.getAvailableSeats(),scheduleRequestResponse);
    	return new ResponseEntity<ScheduledFlightRequestResponse>(scheduledFlightRequestResponseTemp , HttpStatus.OK);
    }
    
   
}
