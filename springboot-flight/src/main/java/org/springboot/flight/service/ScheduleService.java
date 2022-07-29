package org.springboot.flight.service;

import java.util.List;

import org.springboot.flight.model.Schedule;

public interface ScheduleService {
	// save sschedule
	Schedule saveSchedule(Schedule schedule);

	// get all schedule details
	List<Schedule> getAllSchedules();

	// get sepecific Schedule by Id
	Schedule getSchById(int Id);

	// update sepecific Schedule by Id
	Schedule updateSchedule(Schedule schedule, int Id);

	// delete sepecific Schedule by Id
	void deleteSchedule(int Id);

}
