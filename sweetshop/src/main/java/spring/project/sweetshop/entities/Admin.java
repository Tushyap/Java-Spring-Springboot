package spring.project.sweetshop.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

// POJO class 
@Entity
@Table(name ="admin_details")  // set database table name
public class Admin {
	// Data members of POJO class
	@Id // set primary key
	@Column(name="admin_id") // set column name
	private int adminId;
	@Column(name="admin_name") // set column name
	private String adminName;
	
	
	// Encapsulation - Getter and setter to get and set values 
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	
	// Parameterized constructor
	public Admin(int adminId, String adminName) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
	}
	
	// default constructor
	public Admin() {
	
	}
	
	// to string() method to display the output
	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminName=" + adminName + "]";
	}
	


}
