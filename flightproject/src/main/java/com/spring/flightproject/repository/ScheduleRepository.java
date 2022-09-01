package com.spring.flightproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.flightproject.models.Schedule;

public interface ScheduleRepository extends JpaRepository<Schedule ,Integer>{

}
