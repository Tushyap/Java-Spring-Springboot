package com.spring.flightproject.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Airport {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int airportId;
	private String airportName;
	private String airportLocation;
	private String airportCode;
	public Airport(int airportId, String airportName, String airportLocation, String airportCode) {
		super();
		this.airportId = airportId;
		this.airportName = airportName;
		this.airportLocation = airportLocation;
		this.airportCode = airportCode;
	}
	public Airport() {
		super();
	}
	public int getAirportId() {
		return airportId;
	}
	public void setAirportId(int airportId) {
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
