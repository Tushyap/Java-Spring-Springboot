package com.booking.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.booking.entity.Booking;
import com.booking.entity.BookingTb;
import com.booking.entity.Seat;
import com.booking.entity.Show;
import com.booking.service.BookingService;

@RestController
@RequestMapping("/booking")
public class BookingController {

	@Autowired
	private BookingService bookingService;

	@Autowired
	private RestTemplate restTemplate;

	@PostMapping("/save")
	public Booking saveBooking(@RequestBody Booking booking) {

		BookingTb bookingTb = new BookingTb();
		bookingTb.setMovieId(booking.getMovieId());
		bookingTb.setShowId(booking.getShowId());
		bookingTb.setBookingDate(booking.getBookingDate());
		bookingTb.setTransactionId(booking.getTransactionId());
		Double tCost = 0.0;
		List<Long> list = new ArrayList<Long>();
		for (Seat temp : booking.getSeats()) {
			tCost += temp.getSeatPrice();
			list.add(temp.getSeatId());
		}
		bookingTb.setTotalCost(tCost);
		bookingTb.setSeatIds(list);
		bookingTb.setNoOfTickets(booking.getNoOfTickets());
		bookingTb = bookingService.saveBooking(bookingTb);
		booking.setBookingId(bookingTb.getBookingId());
		booking.setTotalCost(bookingTb.getTotalCost());
		return booking;
	}

	@GetMapping("/show")
	public List<Booking> getAllBooking() {
		List<Booking> list = new ArrayList<Booking>();

		List<BookingTb> bList = bookingService.getAllBooking();

		for (BookingTb temp : bList) {
			Booking booking = new Booking();
			System.out.println(temp.getBookingId());
			booking.setBookingId(temp.getBookingId());
			booking.setMovieId(temp.getMovieId());
			booking.setShowId(temp.getShowId());
			booking.setBookingDate(temp.getBookingDate());
			booking.setTransactionId(temp.getTransactionId());
			List<Seat> seats = new ArrayList<Seat>();
			for (Long seat : temp.getSeatIds()) {
				seats.add(restTemplate.getForObject("http://localhost:5050/seat/get/" + seat, Seat.class));
			}

			booking.setTotalCost(temp.getTotalCost());
			booking.setSeats(seats);
			booking.setNoOfTickets(temp.getNoOfTickets());
			booking.setShowRef(
					restTemplate.getForObject("http://localhost:8113/show/get/" + temp.getShowId(), Show.class));
			list.add(booking);
		}
		return list;
	}

	@GetMapping("/show/{id}")
	public Booking getBooking(@PathVariable("id") Long id) {

		BookingTb temp = bookingService.getBooking(id);

		Booking booking = new Booking();
		System.out.println(temp.getBookingId());
		booking.setBookingId(temp.getBookingId());
		booking.setMovieId(temp.getMovieId());
		booking.setShowId(temp.getShowId());
		booking.setBookingDate(temp.getBookingDate());
		booking.setTransactionId(temp.getTransactionId());
		List<Seat> seats = new ArrayList<Seat>();
		for (Long seat : temp.getSeatIds()) {
			seats.add(restTemplate.getForObject("http://localhost:5050/seat/get/" + seat, Seat.class));
		}

		booking.setTotalCost(temp.getTotalCost());
		booking.setSeats(seats);
		booking.setNoOfTickets(temp.getNoOfTickets());
		booking.setShowRef(restTemplate.getForObject("http://localhost:8113/show/get/" + temp.getShowId(), Show.class));

		return booking;
	}

	@PutMapping("/update/{id}")
	public Booking updateBooking(@PathVariable("id") Long id, @RequestBody Booking booking) {

		BookingTb bookingTb = new BookingTb();
		bookingTb.setBookingId(id);
		bookingTb.setMovieId(booking.getMovieId());
		bookingTb.setShowId(booking.getShowId());
		bookingTb.setBookingDate(booking.getBookingDate());
		bookingTb.setTransactionId(booking.getTransactionId());
		Double tCost = 0.0;
		List<Long> list = new ArrayList<Long>();
		for (Seat temp : booking.getSeats()) {
			tCost += temp.getSeatPrice();
			list.add(temp.getSeatId());
		}
		bookingTb.setTotalCost(tCost);
		booking.setTotalCost(tCost);
		bookingTb.setSeatIds(list);
		bookingTb.setNoOfTickets(booking.getNoOfTickets());
		bookingTb = bookingService.saveBooking(bookingTb);
		booking.setBookingId(bookingTb.getBookingId());
		booking.setTotalCost(bookingTb.getTotalCost());
		return booking;
	}

	@DeleteMapping("/delete/{id}")
	public String deleteBooking(@PathVariable("id") Long id) {
		return bookingService.deleteBooking(bookingService.getBooking(id));
	}
}
