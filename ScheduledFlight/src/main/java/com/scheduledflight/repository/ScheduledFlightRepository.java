package com.scheduledflight.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scheduledflight.entity.ScheduledFlight;

public interface ScheduledFlightRepository extends JpaRepository<ScheduledFlight,Long>{

}
