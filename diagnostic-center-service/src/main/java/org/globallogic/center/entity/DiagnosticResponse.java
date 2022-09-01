package org.globallogic.center.entity;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

@Entity
@Table(name="DIAGNOSTIC_CENTER")
public class DiagnosticResponse {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long centerId;
	
	private String centerName;
	
	@ElementCollection
    @OrderColumn(name = "TEST_IDs_TB")
	List<Long> testIds ;
	
	@ElementCollection
    @OrderColumn(name = "APPOINTMENT_IDs_TB")
	List<Long> appointmentIds ;

	public DiagnosticResponse(Long centerId, String centerName, List<Long> testIds, List<Long> appointmentIds) {
		super();
		this.centerId = centerId;
		this.centerName = centerName;
		this.testIds = testIds;
		this.appointmentIds = appointmentIds;
	}

	public DiagnosticResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getCenterId() {
		return centerId;
	}

	public void setCenterId(Long centerId) {
		this.centerId = centerId;
	}

	public String getCenterName() {
		return centerName;
	}

	public void setCenterName(String centerName) {
		this.centerName = centerName;
	}

	public List<Long> getTestIds() {
		return testIds;
	}

	public void setTestIds(List<Long> testIds) {
		this.testIds = testIds;
	}

	public List<Long> getAppointmentIds() {
		return appointmentIds;
	}

	public void setAppointmentIds(List<Long> appointmentIds) {
		this.appointmentIds = appointmentIds;
	}
	
	
}
