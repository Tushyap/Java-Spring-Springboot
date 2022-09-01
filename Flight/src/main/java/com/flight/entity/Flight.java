package com.flight.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="FLIGHT")
public class Flight {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long flightId;
	private String carrierName;
	private String flightModel;
	private Long seatCapacity;

	
	public Flight(Long flightId, String carrierName, String flightModel, Long seatCapacity) {
		super();
		this.flightId = flightId;
		this.carrierName = carrierName;
		this.flightModel = flightModel;
		this.seatCapacity = seatCapacity;

	}
	public Flight() {
		super();
	}
	public Long getFlightId() {
		return flightId;
	}
	public void setFlightId(Long flightId) {
		this.flightId = flightId;
	}
	public String getCarrierName() {
		return carrierName;
	}
	public void setCarrierName(String carrierName) {
		this.carrierName = carrierName;
	}
	public String getFlightModel() {
		return flightModel;
	}
	public void setFlightModel(String flightModel) {
		this.flightModel = flightModel;
	}
	public Long getSeatCapacity() {
		return seatCapacity;
	}
	public void setSeatCapacity(Long seatCapacity) {
		this.seatCapacity = seatCapacity;
	}

	@Override
	public String toString() {
		return "Flight [flightId=" + flightId + ", carrierName=" + carrierName + ", flightModel=" + flightModel
				+ ", seatCapacity=" + seatCapacity + "]";
	}
	
}
