package com.spring.flightproject.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import java.math.BigDecimal;
@Entity
public class Booking {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int bookingId;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="userId")
	private User userId;
	private String bookingDate;
	@OneToMany(mappedBy="booking")
	private List<Passenger> passengerList;
	private BigDecimal ticketCost;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="flightNumber")
	private Flight flight;
	private Integer noOfPassengers;
	public Booking(int bookingId, User userId, String bookingDate, List<Passenger> passengerList,
			BigDecimal ticketCost, Flight flight, Integer noOfPassengers) {
		super();
		this.bookingId = bookingId;
		this.userId = userId;
		this.bookingDate = bookingDate;
		this.passengerList = passengerList;
		this.ticketCost = ticketCost;
		this.flight = flight;
		this.noOfPassengers = noOfPassengers;
	}
	
	public Booking() {
		super();
	}

	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public User getUserId() {
		return userId;
	}
	public void setUserId(User userId) {
		this.userId = userId;
	}
	public String getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}
	public List<Passenger> getPassengerList() {
		return passengerList;
	}
	public void setPassengerList(List<Passenger> passengerList) {
		this.passengerList = passengerList;
	}
	public BigDecimal getTicketCost() {
		return ticketCost;
	}
	public void setTicketCost(BigDecimal ticketCost) {
		this.ticketCost = ticketCost;
	}
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	public Integer getNoOfPassengers() {
		return noOfPassengers;
	}
	public void setNoOfPassengers(Integer noOfPassengers) {
		this.noOfPassengers = noOfPassengers;
	}

	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", userId=" + userId + ", bookingDate=" + bookingDate
				+ ", passengerList=" + passengerList + ", ticketCost=" + ticketCost + ", flight=" + flight
				+ ", noOfPassengers=" + noOfPassengers + "]";
	}
	
	
}
