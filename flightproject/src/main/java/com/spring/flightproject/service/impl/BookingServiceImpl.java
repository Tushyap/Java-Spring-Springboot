package com.spring.flightproject.service.impl;

import com.spring.flightproject.models.Booking;
import com.spring.flightproject.repository.BookingRepository;
import com.spring.flightproject.service.BookingService;

import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class BookingServiceImpl implements BookingService{
private BookingRepository bookingRepository;
	
	public BookingServiceImpl(BookingRepository bookingRepository) {
		super();
		this.bookingRepository=bookingRepository;
	}

	@Override
	public Booking saveBooking(Booking booking) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Booking> getAllBookings() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Booking getEmpById(long Id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Booking updateBooking(Booking Booking, long Id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteBooking(long Id) {
		// TODO Auto-generated method stub
		
	}
}
