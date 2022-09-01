package com.scheduleservice.service;

import com.scheduleservice.model.Schedule;

public interface ScheduleService {
	
	//Abstract method to get the schedule details by Id 
	public Schedule getSchedule(Long Id);

}
