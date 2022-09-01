package com.scheduledflight.entity;

public class ScheduledFlightRequestResponse {
	private Long scheduledFlightId;
	private Flight flight;
	private Long availableSeats;
	private ScheduleRequestResponse scheduleRequestResponse;
	
	public ScheduledFlightRequestResponse(Long scheduledFlightId, Flight flight, Long availableSeats, ScheduleRequestResponse scheduleRequestResponse) {
		super();
		this.scheduledFlightId = scheduledFlightId;
		this.flight = flight;
		this.availableSeats = availableSeats;
		this.scheduleRequestResponse = scheduleRequestResponse;
	}
	
	public ScheduledFlightRequestResponse() {
		super();
	}

	public Long getScheduledFlightId() {
		return scheduledFlightId;
	}
	public void setScheduledFlightId(Long scheduledFlightId) {
		this.scheduledFlightId = scheduledFlightId;
	}
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	public Long getAvailableSeats() {
		return availableSeats;
	}
	public void setAvailableSeats(Long availableSeats) {
		this.availableSeats = availableSeats;
	}
	public ScheduleRequestResponse getScheduleRequestResponse() {
		return scheduleRequestResponse;
	}
	public void setScheduleRequestResponse(ScheduleRequestResponse scheduleRequestResponse) {
		this.scheduleRequestResponse = scheduleRequestResponse;
	}

	@Override
	public String toString() {
		return "Scheduledflight [scheduledFlightId=" + scheduledFlightId + ", flight=" + flight + ", availableSeats="
				+ availableSeats + ", scheduleRequestResponse=" + scheduleRequestResponse + "]";
	}

}
