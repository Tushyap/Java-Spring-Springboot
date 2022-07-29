package org.springboot.flight.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Passengers")
public class Passenger {
	// Data variables
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int passengerId;
	@Column(name = "PNR")
	private long pnrNumber;
	private String passengerName;
	private int passengerAge;
	private long passengerUIN;
	private double luggage;

	// Parameterized Constructor
	public Passenger(int passengerId, long pnrNumber, String passengerName, int passengerAge, long passengerUIN,
			double luggage) {
		super();
		this.passengerId = passengerId;
		this.pnrNumber = pnrNumber;
		this.passengerName = passengerName;
		this.passengerAge = passengerAge;
		this.passengerUIN = passengerUIN;
		this.luggage = luggage;
	}

	// Default Construtor
	public Passenger() {
		super();

	}

	// Getters and Setters
	public int getPassengerId() {
		return passengerId;
	}

	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}

	public long getPnrNumber() {
		return pnrNumber;
	}

	public void setPnrNumber(long pnrNumber) {
		this.pnrNumber = pnrNumber;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public int getPassengerAge() {
		return passengerAge;
	}

	public void setPassengerAge(int passengerAge) {
		this.passengerAge = passengerAge;
	}

	public long getPassengerUIN() {
		return passengerUIN;
	}

	public void setPassengerUIN(long passengerUIN) {
		this.passengerUIN = passengerUIN;
	}

	public double getLuggage() {
		return luggage;
	}

	public void setLuggage(double luggage) {
		this.luggage = luggage;
	}

}
