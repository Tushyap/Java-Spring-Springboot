package com.customer.entity;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Customer_TB")
public class CustomerTb {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long customerId;
	private String customerName;
	private String customerPassword;
	private String dateOfBirth;
	@ElementCollection
	private List<Long> ticketIds;
	private String customerContact;

	public CustomerTb(Long customerId, String customerName, String customerPassword, String dateOfBirth,
			List<Long> ticketIds, String customerContact) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerPassword = customerPassword;
		this.dateOfBirth = dateOfBirth;
		this.ticketIds = ticketIds;
		this.customerContact = customerContact;
	}

	public CustomerTb() {
		super();

	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerPassword() {
		return customerPassword;
	}

	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public List<Long> getTicketIds() {
		return ticketIds;
	}

	public void setTicketIds(List<Long> ticketIds) {
		this.ticketIds = ticketIds;
	}

	public String getCustomerContact() {
		return customerContact;
	}

	public void setCustomerContact(String customerContact) {
		this.customerContact = customerContact;
	}

}
