package com.scheduleservice.model;

import java.util.ArrayList;
import java.util.List;

//POJO class
public class Schedule {

	// Data members

	private Long scheduleId;
	List<Airport> sourceAirport = new ArrayList<>();
	List<Airport> destinationAirport = new ArrayList<>();
	private String arrivalTime;
	private String departureTime;

	// parameterized constructor
	public Schedule(Long scheduleId, List<Airport> sourceAirport, List<Airport> destinationAirport, String arrivalTime,
			String departureTime) {
		super();
		this.scheduleId = scheduleId;
		this.sourceAirport = sourceAirport;
		this.destinationAirport = destinationAirport;
		this.arrivalTime = arrivalTime;
		this.departureTime = departureTime;
	}

	// parameterized constructor
	public Schedule(Long scheduleId, String arrivalTime, String departureTime) {
		super();
		this.scheduleId = scheduleId;
		this.arrivalTime = arrivalTime;
		this.departureTime = departureTime;
	}

	// Default Constructor
	public Schedule() {
		super();

	}

	// Getters and setters for Encapsulation
	public Long getScheduleId() {
		return scheduleId;
	}

	public void setScheduleId(Long scheduleId) {
		this.scheduleId = scheduleId;
	}

	public List<Airport> getSourceAirport() {
		return sourceAirport;
	}

	public void setSourceAirport(List<Airport> sourceAirport) {
		this.sourceAirport = sourceAirport;
	}

	public List<Airport> getDestinationAirport() {
		return destinationAirport;
	}

	public void setDestinationAirport(List<Airport> destinationAirport) {
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

	// to string method to see the output on screen
	@Override
	public String toString() {
		return "Schedule [scheduleId=" + scheduleId + ", sourceAirport=" + sourceAirport + ", destinationAirport="
				+ destinationAirport + ", arrivalTime=" + arrivalTime + ", departureTime=" + departureTime + "]";
	}

}
