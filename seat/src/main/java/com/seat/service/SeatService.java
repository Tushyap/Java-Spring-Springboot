package com.seat.service;

import java.util.List;

import com.seat.model.Seat;

public interface SeatService {

	// save seat 
    public Seat saveSeat(Seat seat);
    
    // get all seats 
	public List<Seat> getAllSeats();
	
	// get one seat
	public Seat getSeatById(Long Id);
	
	// update seat
	public Seat updateSeat(Seat seat, Long Id);
	
	// delete seat
	public void deleteSeat(Long Id);
}
