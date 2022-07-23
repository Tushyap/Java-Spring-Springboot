package spring.project.sweetshop.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
// POJO class
@Entity
@Table(name ="order_details")
public class Order {
	// data members of class
	@Id
	@Column(name="Order_Id")
	private int orderId;
	
	@Column(name="Order_Name")
	private String orderName;
	
	
	@Column(name="Order_Quantity")
	private int orderQuantity;
	
	@Column(name="Order_Price")
	private int orderPrice;
	
	@Column(name="Customer_Name")
	private String customerName;
	
	@Column(name="Customer_Phone")
	private int customerPhone;
	
	@Column(name="Street_Name")
	private String streetName;
	
	@Column(name="City_Name")
	private String city;
	
	@Column(name="State_Name")
	private String State;
	
	@Column(name="Zip_Code")
	private int pinCode;
	
	// Encapsulation - Getter and setter to get and set values 
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public int getOrderQuantity() {
		return orderQuantity;
	}
	public void setOrderQuantity(int orderQuantity) {
		this.orderQuantity = orderQuantity;
	}
	
	public int getOrderPrice() {
		return orderPrice;
	}
	public void setOrderPrice(int orderPrice) {
		this.orderPrice = orderPrice;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getCustomerPhone() {
		return customerPhone;
	}
	public void setCustomerPhone(int customerPhone) {
		this.customerPhone = customerPhone;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	
	// parameterized constructor
	public Order(int orderId, String orderName, int orderQuantity,int orderPrice, String customerName, int customerPhone,
			String streetName, String city, String state, int pinCode) {
		super();
		this.orderId = orderId;
		this.orderName = orderName;
		this.orderQuantity = orderQuantity;
		this.orderPrice = orderPrice;
		this.customerName = customerName;
		this.customerPhone = customerPhone;
		this.streetName = streetName;
		this.city = city;
		State = state;
		this.pinCode = pinCode;
	}
	//default constructor
	public Order() {
		
	}

	// to string() method to display the output
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderName=" + orderName + ", orderQuantity=" + orderQuantity
				+ ", orderPrice=" + orderPrice + ", customerName=" + customerName + ", customerPhone=" + customerPhone
				+ ", streetName=" + streetName + ", city=" + city + ", State=" + State + ", pinCode=" + pinCode + "]";
	}
	
	

	
	
	

}
