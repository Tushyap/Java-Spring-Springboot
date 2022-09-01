package org.orderservice.model;

public class Order {
	
	private Long orId;
	private String orName;
	private String orDesc;
	private Long pId;
	
	public Order(Long orId, String orName, String orDesc, Long pId) {
		super();
		this.orId = orId;
		this.orName = orName;
		this.orDesc = orDesc;
		this.pId = pId;
	}
	
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Long getOrId() {
		return orId;
	}
	public void setOrId(Long orId) {
		this.orId = orId;
	}
	public String getOrName() {
		return orName;
	}
	public void setOrName(String orName) {
		this.orName = orName;
	}
	public String getOrDesc() {
		return orDesc;
	}
	public void setOrDesc(String orDesc) {
		this.orDesc = orDesc;
	}
	public Long getpId() {
		return pId;
	}
	public void setpId(Long pId) {
		this.pId = pId;
	}
	
	

}
