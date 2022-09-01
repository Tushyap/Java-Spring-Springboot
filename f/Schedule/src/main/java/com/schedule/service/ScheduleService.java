package com.schedule.service;

import java.util.List;


import com.schedule.entity.Schedule;

public interface ScheduleService {
	
	public Schedule getBySchId(Long Id);	
	public Schedule saveSchedule(Schedule schedule);
	public Schedule updateSchedule(Schedule schedule);
}
