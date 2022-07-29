package org.springboot.flight.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Schedule {
	// data variables
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int scheduleId;
	@ManyToOne(cascade = { CascadeType.ALL}, fetch = FetchType.LAZY)
	@JoinColumn(name = "airportId")
	private Airport sourceAirport;
	@ManyToOne(cascade = { CascadeType.ALL}, fetch = FetchType.LAZY)
	@JoinColumn(name = "airportId2")
	private Airport destinationAirport;
	private String arrivalTime;
	private String departureTime;

	// parameterized constructor
	public Schedule(int scheduleId, Airport sourceAirport, Airport destinationAirport, String arrivalTime,
			String departureTime) {
		super();
		this.scheduleId = scheduleId;
		this.sourceAirport = sourceAirport;
		this.destinationAirport = destinationAirport;
		this.arrivalTime = arrivalTime;
		this.departureTime = departureTime;
	}

	// Default Constructor
	public Schedule() {
		super();
	}

	// Getters and setters
	public int getScheduleId() {
		return scheduleId;
	}

	public void setScheduleId(int scheduleId) {
		this.scheduleId = scheduleId;
	}

	public Airport getSourceAirport() {
		return sourceAirport;
	}

	public void setSourceAirport(Airport sourceAirport) {
		this.sourceAirport = sourceAirport;
	}

	public Airport getDestinationAirport() {
		return destinationAirport;
	}

	public void setDestinationAirport(Airport destinationAirport) {
		this.destinationAirport = destinationAirport;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

}
