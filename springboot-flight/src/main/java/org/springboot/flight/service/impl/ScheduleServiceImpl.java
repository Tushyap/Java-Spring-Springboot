package org.springboot.flight.service.impl;

import java.util.List;

import org.springboot.flight.exception.ResourceNotFoundException;
import org.springboot.flight.model.Schedule;
import org.springboot.flight.repository.ScheduleRepository;
import org.springboot.flight.service.ScheduleService;
import org.springframework.stereotype.Service;

@Service
public class ScheduleServiceImpl implements ScheduleService{
	
private ScheduleRepository scheduleRepository;
	
	public ScheduleServiceImpl(ScheduleRepository scheduleRepository) {
		super();
		this.scheduleRepository=scheduleRepository;
	}

	@Override
	public Schedule saveSchedule(Schedule schedule) {
		return  scheduleRepository.save(schedule);
	}

	@Override
	public List<Schedule> getAllSchedules() {	
		return scheduleRepository.findAll();
	}

	@Override
	public Schedule getSchById(int Id) {
//		Optional<Schedule> Schedule = ScheduleRepository.findById(Id);
//		if(Schedule.isPresent()) {
//			return Schedule.get();	
//			}else {
//				throw new ResourceNotFoundException("Schedule","Id",Id);
//			}
		return  scheduleRepository.findById(Id).orElseThrow( 
				()-> new ResourceNotFoundException ("Schedule","Id",Id));
			
	}

	@Override
	public Schedule updateSchedule(Schedule schedule, int Id) {
		Schedule existingSchedule = scheduleRepository.findById(Id).orElseThrow( 
				()-> new ResourceNotFoundException ("Schedule","Id",Id));
		existingSchedule.setScheduleId(schedule.getScheduleId());
		existingSchedule.setSourceAirport(schedule.getSourceAirport());
		existingSchedule.setDestinationAirport(schedule.getDestinationAirport());
		existingSchedule.setArrivalTime(schedule.getArrivalTime());
		existingSchedule.setDepartureTime(schedule.getDepartureTime());
		
		scheduleRepository.save(existingSchedule);
		return existingSchedule;
	}

	@Override
	public void deleteSchedule(int Id) {
		Schedule existSchedule = scheduleRepository.findById(Id).orElseThrow( 
				()-> new ResourceNotFoundException ("Schedule","Id",Id));
		scheduleRepository.delete(existSchedule);
	}


}
