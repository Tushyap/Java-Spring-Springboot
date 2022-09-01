package com.spring.flightproject.service;

import java.util.List;

import com.spring.flightproject.models.User;

public interface UserService {

	User saveUser(User user);
	
	List<User> getAllUsers();
	
	// get sepecific User by Id
	User getUserById(int Id);
	
	// update sepecific User by Id
	User updateUser(User User, int Id);
	
	// delete sepecific User by Id
	void deleteUser(int Id);
}
