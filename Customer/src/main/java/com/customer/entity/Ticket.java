package com.customer.entity;

import java.util.ArrayList;
import java.util.List;

public class Ticket {

	private Long ticketId;
	private int noOfSeats;
	private List<String> seatName = new ArrayList<String>();
	private Booking bookingRef;
	private boolean ticketStatus;
	private String screenName;

	public Ticket(Long ticketId, int noOfSeats, List<String> seatName, Booking bookingRef, boolean ticketStatus,
			String screenName) {
		super();
		this.ticketId = ticketId;
		this.noOfSeats = noOfSeats;
		this.seatName = seatName;
		this.bookingRef = bookingRef;
		this.ticketStatus = ticketStatus;
		this.screenName = screenName;
	}

	public Ticket() {
		super();

	}

	public Long getTicketId() {
		return ticketId;
	}

	public void setTicketId(Long ticketId) {
		this.ticketId = ticketId;
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	public List<String> getSeatName() {
		return seatName;
	}

	public void setSeatName(List<String> seatName) {
		this.seatName = seatName;
	}

	public Booking getBookingRef() {
		return bookingRef;
	}

	public void setBookingRef(Booking bookingRef) {
		this.bookingRef = bookingRef;
	}

	public boolean isTicketStatus() {
		return ticketStatus;
	}

	public void setTicketStatus(boolean ticketStatus) {
		this.ticketStatus = ticketStatus;
	}

	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

}
