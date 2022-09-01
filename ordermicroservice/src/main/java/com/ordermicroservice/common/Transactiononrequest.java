package com.ordermicroservice.common;

import com.ordermicroservice.entity.Order;

public class Transactiononrequest {
	
	private Order order;
	private Payment payment;
	
	public Transactiononrequest(Order order, Payment payment) {
		super();
		this.order = order;
		this.payment = payment;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public Transactiononrequest() {
		super();
		// TODO Auto-generated constructor stub
	}
		

}
