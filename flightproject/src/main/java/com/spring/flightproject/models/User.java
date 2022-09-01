package com.spring.flightproject.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class User {
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private int userId;
		private String userType;
		private String userName;
		private String userPassword;
		private int userPhone;
		private String email;
		public User(int userId, String userType, String userName, String userPassword, int userPhone,
				String email) {
			super();
			this.userId = userId;
			this.userType = userType;
			this.userName = userName;
			this.userPassword = userPassword;
			this.userPhone = userPhone;
			this.email = email;
		}
		public User() {
			super();
		}
		public int getUserId() {
			return userId;
		}
		public void setUserId(int userId) {
			this.userId = userId;
		}
		public String getUserType() {
			return userType;
		}
		public void setUserType(String userType) {
			this.userType = userType;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getUserPassword() {
			return userPassword;
		}
		public void setUserPassword(String userPassword) {
			this.userPassword = userPassword;
		}
		public int getUserPhone() {
			return userPhone;
		}
		public void setUserPhone(int userPhone) {
			this.userPhone = userPhone;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		@Override
		public String toString() {
			return "User [userId=" + userId + ", userType=" + userType + ", userName=" + userName + ", userPassword="
					+ userPassword + ", userPhone=" + userPhone + ", email=" + email + "]";
		}
		
}
