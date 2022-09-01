package org.globallogic.appointment.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "APPOINTMENT_TB")
public class AppointmentResponseTB {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long appointmentId;	
	
	private Long userId;		
	private String dateTime;
	private boolean approved;
	private Long testId;
	private Long centerId;
	public AppointmentResponseTB(Long appointmentId, Long userId, String dateTime, boolean approved, Long testId,
			Long centerId) {
		super();
		this.appointmentId = appointmentId;
		this.userId = userId;
		this.dateTime = dateTime;
		this.approved = approved;
		this.testId = testId;
		this.centerId = centerId;
	}
	public AppointmentResponseTB() {
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
	public Long getTestId() {
		return testId;
	}
	public void setTestId(Long testId) {
		this.testId = testId;
	}
	public Long getCenterId() {
		return centerId;
	}
	public void setCenterId(Long centerId) {
		this.centerId = centerId;
	}
	
	
}
