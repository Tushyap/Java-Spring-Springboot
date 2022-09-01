package com.scheduledflight.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SCHEDULEDFLIGHT")
public class ScheduledFlight {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long scheduledFlightId;
	private Long flightId;
	private Long availableSeats;
	private Long scheduleId;
	
	public ScheduledFlight(Long scheduledFlightId, Long flightId, Long availableSeats, Long scheduleId) {
		super();
		this.scheduledFlightId = scheduledFlightId;
		this.flightId = flightId;
		this.availableSeats = availableSeats;
		this.scheduleId = scheduleId;
	}
	
	public ScheduledFlight() {
		super();
	}

	public Long getScheduledFlightId() {
		return scheduledFlightId;
	}
	public void setScheduledFlightId(Long scheduledFlightId) {
		this.scheduledFlightId = scheduledFlightId;
	}
	public Long getFlightId() {
		return flightId;
	}
	public void setFlightId(Long flightId) {
		this.flightId = flightId;
	}
	public Long getAvailableSeats() {
		return availableSeats;
	}
	public void setAvailableSeats(Long availableSeats) {
		this.availableSeats = availableSeats;
	}
	public Long getScheduleId() {
		return scheduleId;
	}
	public void setScheduleId(Long scheduleId) {
		this.scheduleId = scheduleId;
	}

	@Override
	public String toString() {
		return "Scheduledflight [scheduledFlightId=" + scheduledFlightId + ", flight=" + flightId + ", availableSeats="
				+ availableSeats + ", schedule=" + scheduleId + "]";
	}
	
}
