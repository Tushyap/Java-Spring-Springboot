package com.booking.service;

import java.util.List;

import com.booking.entity.BookingTb;


public interface BookingService {

	public BookingTb saveBooking(BookingTb bookingTb);
	
	public List<BookingTb> getAllBooking();
	
	public BookingTb getBooking(Long bookingId);
	
	public BookingTb updateBooking(BookingTb bookingTb);
	
	public String deleteBooking(BookingTb bookingTb);
}
