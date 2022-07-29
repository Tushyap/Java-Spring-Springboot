package org.springboot.flight.service;

import java.util.List;

import org.springboot.flight.model.User;

public interface UserService {
	// To save the user record
	User saveUser(User user);

	// To get user records
	List<User> getAllUsers();

	// get sepecific user by Id
	User getOneUser(long Id);

	// update sepecific user by Id
	User updateUser(User user, long Id);

	// delete sepecific user by Id
	void deleteUser(long Id);

}
