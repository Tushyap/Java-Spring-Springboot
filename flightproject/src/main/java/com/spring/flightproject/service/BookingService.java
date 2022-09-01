package com.spring.flightproject.service;

import java.util.List;

import com.spring.flightproject.models.Booking;

public interface BookingService {

	Booking saveBooking(Booking booking);
	
	List<Booking> getAllBookings();
	
	// get sepecific Booking by Id
	Booking getEmpById(long Id);
	
	// update sepecific Booking by Id
	Booking updateBooking(Booking Booking, long Id);
	
	// delete sepecific Booking by Id
	void deleteBooking(long Id);
}
