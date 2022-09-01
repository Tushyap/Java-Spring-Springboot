package com.spring.flightproject.service;

import java.util.List;

import com.spring.flightproject.models.Schedule;

public interface ScheduleService {

	Schedule saveSchedule(Schedule schedule); 
	
	List<Schedule> getAllSchedules();
	
	// get sepecific Schedule by Id
	Schedule getSchById(int Id);
	
	// update sepecific Schedule by Id
	Schedule updateSchedule(Schedule schedule, int Id);
	
	// delete sepecific Schedule by Id
	void deleteSchedule(int Id);
}
