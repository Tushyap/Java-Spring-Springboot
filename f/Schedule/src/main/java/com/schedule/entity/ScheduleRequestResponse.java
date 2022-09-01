package com.schedule.entity;

public class ScheduleRequestResponse {
	private Long scheduleId;
	private Airport sourceAirport;
	private Airport destinationAirport;
	private String arrivalTime;
	private String departureTime;
	public ScheduleRequestResponse(Long scheduleId, Airport sourceAirport, Airport destinationAirport,
			String arrivalTime, String departureTime) {
		super();
		this.scheduleId = scheduleId;
		this.sourceAirport = sourceAirport;
		this.destinationAirport = destinationAirport;
		this.arrivalTime = arrivalTime;
		this.departureTime = departureTime;
	}
	public ScheduleRequestResponse() {
		super();
	}
	public Long getScheduleId() {
		return scheduleId;
	}
	public void setScheduleId(Long scheduleId) {
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
	@Override
	public String toString() {
		return "ScheduleRequestResponse [scheduleId=" + scheduleId + ", sourceAirport=" + sourceAirport
				+ ", destinationAirport=" + destinationAirport + ", arrivalTime=" + arrivalTime + ", departureTime="
				+ departureTime + "]";
	}

}
