package com.example.user.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
	     private Long userId;
		
		@Column(nullable = false,length=100)
	    private String username;
		
		@Column(nullable = false,length=100)
	     private String password;
		
		@Column(nullable=false)
		private String userType;
		
		@Column
		private Boolean login=false;
}
