package com.booking.entity;

import java.util.ArrayList;
import java.util.List;

public class Booking {

	private Long bookingId;
	private Long movieId;
	private Long showId;
	private String bookingDate;
	private Show showRef;	
	private String transactionId;
	private double totalCost;
	private List<Seat> seats = new ArrayList<>();
	private int noOfTickets;
	
	public Booking(Long bookingId, Long movieId, Long showId, String bookingDate, Show showRef, String transactionId,
			double totalCost, List<Seat> seats, int noOfTickets) {
		super();
		this.bookingId = bookingId;
		this.movieId = movieId;
		this.showId = showId;
		this.bookingDate = bookingDate;
		this.showRef = showRef;
		this.transactionId = transactionId;
		this.totalCost = totalCost;
		this.seats = seats;
		this.noOfTickets = noOfTickets;
	}

	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getBookingId() {
		return bookingId;
	}

	public void setBookingId(Long bookingId) {
		this.bookingId = bookingId;
	}

	public Long getMovieId() {
		return movieId;
	}

	public void setMovieId(Long movieId) {
		this.movieId = movieId;
	}

	public Long getShowId() {
		return showId;
	}

	public void setShowId(Long showId) {
		this.showId = showId;
	}

	public String getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}

	public Show getShowRef() {
		return showRef;
	}

	public void setShowRef(Show showRef) {
		this.showRef = showRef;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}

	public List<Seat> getSeats() {
		return seats;
	}

	public void setSeats(List<Seat> seats) {
		this.seats = seats;
	}

	public int getNoOfTickets() {
		return noOfTickets;
	}

	public void setNoOfTickets(int noOfTickets) {
		this.noOfTickets = noOfTickets;
	}
	
}
