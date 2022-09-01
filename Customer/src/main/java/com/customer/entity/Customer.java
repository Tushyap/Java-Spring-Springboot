package com.customer.entity;

import java.util.ArrayList;
import java.util.List;

public class Customer {

	private Long customerId;
	private String customerName;
	private String customerPassword;
	private String dateOfBirth;
	List<Ticket> ticketList = new ArrayList<>();
	private String customerContact;

	public Customer(Long customerId, String customerName, String customerPassword, String dateOfBirth,
			List<Ticket> ticketList, String customerContact) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerPassword = customerPassword;
		this.dateOfBirth = dateOfBirth;
		this.ticketList = ticketList;
		this.customerContact = customerContact;
	}

	public Customer() {
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

	public List<Ticket> getTicketList() {
		return ticketList;
	}

	public void setTicketList(List<Ticket> ticketList) {
		this.ticketList = ticketList;
	}

	public String getCustomerContact() {
		return customerContact;
	}

	public void setCustomerContact(String customerContact) {
		this.customerContact = customerContact;
	}

}
