package com.spring.flightproject.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Passenger {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int pnrNumber;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="bookingId")
	private Booking booking;
	private String passengerName;
	private Integer passengerAge;
	private int passengerUIN;
	private Integer luggage;
	
	public Passenger(int pnrNumber, String passengerName, Integer passengerAge, int passengerUIN,
			Integer luggage) {
		super();
		this.pnrNumber = pnrNumber;
		this.passengerName = passengerName;
		this.passengerAge = passengerAge;
		this.passengerUIN = passengerUIN;
		this.luggage = luggage;
	}
	
	public Passenger() {
		super();
	}

	public int getPnrNumber() {
		return pnrNumber;
	}
	public void setPnrNumber(int pnrNumber) {
		this.pnrNumber = pnrNumber;
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public Integer getPassengerAge() {
		return passengerAge;
	}
	public void setPassengerAge(Integer passengerAge) {
		this.passengerAge = passengerAge;
	}
	public int getPassengerUIN() {
		return passengerUIN;
	}
	public void setPassengerUIN(int passengerUIN) {
		this.passengerUIN = passengerUIN;
	}
	public Integer getLuggage() {
		return luggage;
	}
	public void setLuggage(Integer luggage) {
		this.luggage = luggage;
	}

	@Override
	public String toString() {
		return "Passenger [pnrNumber=" + pnrNumber + ", passengerName=" + passengerName + ", passengerAge="
				+ passengerAge + ", passengerUIN=" + passengerUIN + ", luggage=" + luggage + "]";
	}	
	
}
