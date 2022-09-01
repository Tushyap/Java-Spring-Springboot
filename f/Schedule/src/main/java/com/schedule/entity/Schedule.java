package com.schedule.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SCHEDULE")

public class Schedule {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long scheduleId;
	private Long sourceAirportId;
	private Long destinationAirportId;
	private String arrivalTime;
	private String departureTime;

	
	
	public Schedule(Long scheduleId, Long sourceAirportId, Long destinationAirportId, String arrivalTime,
			String departureTime) {
		super();
		this.scheduleId = scheduleId;
		this.sourceAirportId = sourceAirportId;
		this.destinationAirportId = destinationAirportId;
		this.arrivalTime = arrivalTime;
		this.departureTime = departureTime;
	}
	public Schedule() {
		super();
	}
	public Long getScheduleId() {
		return scheduleId;
	}
	public void setScheduleId(Long scheduleId) {
		this.scheduleId = scheduleId;
	}
	public Long getSourceAirportId() {
		return sourceAirportId;
	}
	public void setSourceAirportId(Long sourceAirportId) {
		this.sourceAirportId = sourceAirportId;
	}
	public Long getDestinationAirportId() {
		return destinationAirportId;
	}
	public void setDestinationAirportId(Long destinationAirportId) {
		this.destinationAirportId = destinationAirportId;
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
	
	
	@Override
	public String toString() {
		return "Schedule [scheduleId=" + scheduleId + ", sourceAirport=" + sourceAirportId + ", destinationAirport="
				+ destinationAirportId + ", arrivalTime=" + arrivalTime + ", departureTime=" + departureTime + "]";
	}
	
}
