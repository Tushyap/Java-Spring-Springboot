package com.schedule.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AIRPORT")
public class Airport {
	// data members
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long airportId;
	private String airportName;
	private String airportLocation;
	private String airportCode;

	// parameterized constructor
	public Airport(Long airportId, String airportName, String airportLocation, String airportCode) {
		super();
		this.airportId = airportId;
		this.airportName = airportName;
		this.airportLocation = airportLocation;
		this.airportCode = airportCode;
	}

	// default constructor 
	public Airport() {
		super();
	}

	// data encapsulation - getter and setter  
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

	@Override
	public String toString() {
		return "Airport [airportId=" + airportId + ", airportName=" + airportName + ", airportLocation="
				+ airportLocation + ", airportCode=" + airportCode + "]";
	}

}
