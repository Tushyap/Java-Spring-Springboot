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

import com.spring.flightproject.models.ScheduledFlight;
import com.spring.flightproject.service.ScheduledFlightService;

@RestController
@RequestMapping("/api/ScheduledFlight")
public class ScheduledFlightController {
	@Autowired
	private ScheduledFlightService scheduledFlightService;
	
	public ScheduledFlightController(ScheduledFlightService scheduledFlightService) {
		super();
		this.scheduledFlightService= scheduledFlightService;
	}
	
	// build create ScheduledFlight rest api
	@PostMapping()
	public ResponseEntity<ScheduledFlight> saveScheduledFlight(@RequestBody ScheduledFlight scheduledFlight){
		return new ResponseEntity<ScheduledFlight>(scheduledFlightService.saveScheduledFlight(scheduledFlight), HttpStatus.CREATED);
	}
	
	// build a method to get ScheduledFlights 
    @GetMapping()
	public  List<ScheduledFlight> getAllScheduledFlights(){
		return scheduledFlightService.getAllScheduledFlights();
	}
    
    // Build method to get single ScheduledFlight
    @GetMapping("/{id}")
    public ResponseEntity<ScheduledFlight> getEmpById(@PathVariable("id") int Id){
    	return new ResponseEntity<ScheduledFlight>(scheduledFlightService.getScheduledFlightById(Id), HttpStatus.OK);
    }
    
    // Build method to update a specific ScheduledFlight details
    @PutMapping("/{id}")
    public ResponseEntity<ScheduledFlight> updateScheduledFlight(@PathVariable("id") int Id, @RequestBody ScheduledFlight scheduledFlight){
    	return new ResponseEntity<ScheduledFlight>(scheduledFlightService.updateScheduledFlight(scheduledFlight,Id), HttpStatus.OK);
    }
    
    // Build Method to delete specific ScheduledFlight details 
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteScheduledFlight(@PathVariable("id") int Id){
    	scheduledFlightService.deleteScheduledFlight(Id);
    	return new ResponseEntity<String>("ScheduledFlight record delete ", HttpStatus.OK);
    }
}
