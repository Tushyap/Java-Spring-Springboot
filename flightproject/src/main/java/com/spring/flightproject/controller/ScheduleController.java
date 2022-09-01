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

import com.spring.flightproject.models.Schedule;
import com.spring.flightproject.service.ScheduleService;

@RestController
@RequestMapping("/api/Schedule")
public class ScheduleController {
	@Autowired
	private ScheduleService scheduleService;
	
	public ScheduleController(ScheduleService scheduleService) {
		super();
		this.scheduleService= scheduleService;
	}
	
	// build create Schedule rest api
	@PostMapping()
	public ResponseEntity<Schedule> saveSchedule(@RequestBody Schedule schedule){
		return new ResponseEntity<Schedule>(scheduleService.saveSchedule(schedule), HttpStatus.CREATED);
	}
	
	// build a method to get Schedules 
    @GetMapping()
	public  List<Schedule> getAllSchedules(){
		return scheduleService.getAllSchedules();
	}
    
    // Build method to get single Schedule
    @GetMapping("/{id}")
    public ResponseEntity<Schedule> getEmpById(@PathVariable("id") int Id){
    	return new ResponseEntity<Schedule>(scheduleService.getSchById(Id), HttpStatus.OK);
    }
    
    // Build method to update a specific Schedule details
    @PutMapping("/{id}")
    public ResponseEntity<Schedule> updateSchedule(@PathVariable("id") int Id, @RequestBody Schedule Schedule){
    	return new ResponseEntity<Schedule>(scheduleService.updateSchedule(Schedule,Id), HttpStatus.OK);
    }
    
    // Build Method to delete specific Schedule details 
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteSchedule(@PathVariable("id") int Id){
    	scheduleService.deleteSchedule(Id);
    	return new ResponseEntity<String>("Schedule record delete ", HttpStatus.OK);
    }
}
