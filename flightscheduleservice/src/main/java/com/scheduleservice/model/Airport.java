package com.scheduleservice.model;

// POJO class
public class Airport {

	// Data members
	private Long airportId;
	private String airportName;
	private String airportLocation;
	private String airportCode;
	private Long scheduleId;

	// parameterized constructor
	public Airport(Long airportId, String airportName, String airportLocation, String airportCode, Long scheduleId) {
		super();
		this.airportId = airportId;
		this.airportName = airportName;
		this.airportLocation = airportLocation;
		this.airportCode = airportCode;
		this.scheduleId = scheduleId;
	}

	// default constructor
	public Airport() {
		super();

	}

	// Data encapsulation - Getters and setters
	public Long getAirportId() {
		return airportId;
	}

	public void setAirportId(Long airportId) {
		this.airportId = airportId;
	}

	public String getAirportName() {
		return airportName;
	}

	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}

	public String getAirportLocation() {
		return airportLocation;
	}

	public void setAirportLocation(String airportLocation) {
		this.airportLocation = airportLocation;
	}

	public String getAirportCode() {
		return airportCode;
	}

	public void setAirportCode(String airportCode) {
		this.airportCode = airportCode;
	}

	public Long getScheduleId() {
		return scheduleId;
	}

	public void setScheduleId(Long scheduleId) {
		this.scheduleId = scheduleId;
	}

}
