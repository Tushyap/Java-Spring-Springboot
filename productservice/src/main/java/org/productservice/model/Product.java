package org.productservice.model;

import java.util.ArrayList;
import java.util.List;

public class Product {
	
	private Long pId;
	private String pName;
	private String pDesc;
	private double pPrice;
	List<Order> orders = new ArrayList<>();
	
	public Product(Long pId, String pName, String pDesc, double pPrice, List<Order> orders) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pDesc = pDesc;
		this.pPrice = pPrice;
		this.orders = orders;
	}
	
	public Product(Long pId, String pName, String pDesc, double pPrice) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pDesc = pDesc;
		this.pPrice = pPrice;
	}


	public Product() {
		super();
		
	}

	public Long getpId() {
		return pId;
	}

	public void setpId(Long pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getpDesc() {
		return pDesc;
	}

	public void setpDesc(String pDesc) {
		this.pDesc = pDesc;
	}

	public double getpPrice() {
		return pPrice;
	}

	public void setpPrice(double pPrice) {
		this.pPrice = pPrice;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	

}
