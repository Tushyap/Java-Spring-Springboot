package com.schedule.service;

import com.schedule.entity.Schedule;

public interface ScheduleService {

	public Schedule saveSchedule(Schedule schedule);
	
	public Schedule getSchedule(Long Id);
	
	public Schedule updateSchedule(Schedule schedule);
	
	public String deleteSchedule(Schedule schedule);
}
