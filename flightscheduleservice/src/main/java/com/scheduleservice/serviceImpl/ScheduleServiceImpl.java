package com.scheduleservice.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.scheduleservice.model.Schedule;
import com.scheduleservice.service.ScheduleService;

@Service
public class ScheduleServiceImpl implements ScheduleService {
	// List of schedule
	List<Schedule> list = List.of(
			new Schedule(100L,null,null, "12:30 PM","2:00 PM"),
			new Schedule(101L,null,null, "11:30 AM","1:00 PM"),
			new Schedule(102L,null,null, "10:30 AM","12:00 PM"));

	//Method - returns the list of schedule object
	@Override
	public Schedule getSchedule(Long Id) {	
		return list.stream().filter(schedule -> schedule.getScheduleId().equals(Id)).findAny().orElse(null);
	}

}
