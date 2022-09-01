package com.seat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.seat.model.Seat;

@Repository
public interface SeatRepository extends JpaRepository<Seat,Long> {

	@Query("SELECT CASE WHEN COUNT(s)>0 THEN TRUE ELSE FALSE END FROM Seat s WHERE s.seatId=?1")
	Boolean isSeatExists(Long id);
}
