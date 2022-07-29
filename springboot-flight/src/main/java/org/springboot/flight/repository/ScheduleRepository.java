package org.springboot.flight.repository;

import org.springboot.flight.model.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScheduleRepository extends JpaRepository<Schedule ,Integer>{

}
