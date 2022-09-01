package org.globallogic.appointment.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TEST")
public class Test {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long testId;
	private String testName;
	
	public Test(Long testId, String testName) {
		super();
		this.testId = testId;
		this.testName = testName;
	}

	public Test() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getTestId() {
		return testId;
	}

	public void setTestId(Long testId) {
		this.testId = testId;
	}

	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}
	
	
}
