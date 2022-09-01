package com.ordermicroservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ORDER_TB")
public class Order {
	@Id
	@Column(name="Order_id")
	private int orderId;	
	@Column(name="Order_Name")
	private String name;
	@Column(name="Quantity")
	private int qty;	
	@Column(name="Price")
	private double price;
	
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public Order(int orderId, String name, int qty, double price) {
		super();
		this.orderId = orderId;
		this.name = name;
		this.qty = qty;
		this.price = price;
	}
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	


}
