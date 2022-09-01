package com.booking.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.booking.entity.BookingTb;
import com.booking.exception.ResourceNotFoundException;
import com.booking.repository.BookingRepository;
import com.booking.service.BookingService;

@Service
public class BookingServiceImpl implements BookingService {

	@Autowired
	private BookingRepository bookingRepository;
	
	@Override
	public BookingTb saveBooking(BookingTb bookingTb) {
		return  bookingRepository.save(bookingTb);
	}

	@Override
	public List<BookingTb> getAllBooking() {
		return bookingRepository.findAll();
	}

	@Override
	public BookingTb getBooking(Long bookingId) {
		return bookingRepository.findById(bookingId).orElseThrow(() -> new ResourceNotFoundException("Booking", "bookingId", bookingId));
	}

	@Override
	public BookingTb updateBooking(BookingTb bookingTb) {
		return bookingRepository.save(bookingTb);
	}

	@Override
	public String deleteBooking(BookingTb bookingTb) {
		Long id = bookingTb.getBookingId();
		bookingRepository.delete(bookingTb);
		return "Booking "+ id + "deleted...";
	}

}
