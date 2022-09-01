package com.scheduledflight.service;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scheduledflight.entity.ScheduledFlight;
import com.scheduledflight.repository.ScheduledFlightRepository;
@Service
public class ScheduledFlightServiceImpl implements ScheduledFlightService{
	
	@Autowired
	private ScheduledFlightRepository scheduledflightRepository;

	

	@Override
	public ScheduledFlight getScheduledFlightById(Long Id) {
		
		return scheduledflightRepository.findById(Id).get();
			
	}



	@Override
	public ScheduledFlight save(ScheduledFlight scheduledFlight) {
		// TODO Auto-generated method stub
		return scheduledflightRepository.save(scheduledFlight);
	}



}
