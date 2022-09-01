package org.globallogic.center.entity;


public class Appointment {
	
	private Long appointmentId;	
	private Long userId;		
	private String dateTime;
	private boolean approved;
	private Test test;
	private Long centerId;
	
	public Appointment(Long appointmentId, Long userId, String dateTime, boolean approved, Test test, Long centerId) {
		super();
		this.appointmentId = appointmentId;
		this.userId = userId;
		this.dateTime = dateTime;
		this.approved = approved;
		this.test = test;
		this.centerId = centerId;
	}
	
	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getAppointmentId() {
		return appointmentId;
	}
	public void setAppointmentId(Long appointmentId) {
		this.appointmentId = appointmentId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getDateTime() {
		return dateTime;
	}
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
	public boolean isApproved() {
		return approved;
	}
	public void setApproved(boolean approved) {
		this.approved = approved;
	}
	public Test getTest() {
		return test;
	}
	public void setTest(Test test) {
		this.test = test;
	}
	public Long getCenterId() {
		return centerId;
	}
	public void setCenterId(Long centerId) {
		this.centerId = centerId;
	}

	
}
