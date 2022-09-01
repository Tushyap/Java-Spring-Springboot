package com.spring.flightproject.service.impl;

import com.spring.flightproject.exception.ResourceNotFoundException;
import com.spring.flightproject.models.Schedule;
import com.spring.flightproject.repository.ScheduleRepository;
import com.spring.flightproject.service.ScheduleService;

import java.util.List;

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
