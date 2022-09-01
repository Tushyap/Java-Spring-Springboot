package org.globallogic.center.entity;
import java.util.List;

public class Diagnostic {
	
	private Long centerId;
	private String centerName;
	private List<Test> tests;
	private List<Appointment> apppointmentList;
	
	public Diagnostic(Long centerId, String centerName, List<Test> tests, List<Appointment> apppointmentList) {
		super();
		this.centerId = centerId;
		this.centerName = centerName;
		this.tests = tests;
		this.apppointmentList = apppointmentList;
	}

	public Diagnostic() {
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

	public List<Test> getTests() {
		return tests;
	}

	public void setTests(List<Test> tests) {
		this.tests = tests;
	}

	public List<Appointment> getApppointmentList() {
		return apppointmentList;
	}

	public void setApppointmentList(List<Appointment> apppointmentList) {
		this.apppointmentList = apppointmentList;
	}
	
	
}
