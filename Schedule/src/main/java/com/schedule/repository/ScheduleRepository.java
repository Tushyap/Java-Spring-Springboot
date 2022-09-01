package com.schedule.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.schedule.entity.Schedule;

public interface ScheduleRepository extends JpaRepository<Schedule,Long>{

}
