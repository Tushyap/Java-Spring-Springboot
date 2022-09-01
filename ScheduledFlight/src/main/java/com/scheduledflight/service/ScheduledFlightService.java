package com.scheduledflight.service;



import com.scheduledflight.entity.ScheduledFlight;


public interface ScheduledFlightService {

	public ScheduledFlight save(ScheduledFlight scheduledFlight);
	
	// get sepecific ScheduledFlight by Id
	public ScheduledFlight getScheduledFlightById(Long Id);
	

}
