package org.springboot.flight.service.impl;

import java.util.List;
import org.springboot.flight.exception.ResourceNotFoundException;
import org.springboot.flight.model.User;
import org.springboot.flight.repository.UserRepository;
import org.springboot.flight.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	// data variables;
	private UserRepository userRepo;

	// constructor
	public UserServiceImpl(UserRepository userRepo) {
		super();
		this.userRepo = userRepo;
	}

	// save record
	@Override
	public User saveUser(User user) {
		return userRepo.save(user);
	}

	// get record
	@Override
	public List<User> getAllUsers() {
		return userRepo.findAll();
	}

	// get one specific record
	@Override
	public User getOneUser(long Id) {
		return userRepo.findById(Id).orElseThrow(() -> new ResourceNotFoundException("User", "Id", Id));
	}

	// update record
	@Override
	public User updateUser(User user, long Id) {
		User existingUser = userRepo.findById(Id).orElseThrow(() -> new ResourceNotFoundException("User", "Id", Id));
		existingUser.setUserName(user.getUserName());
		existingUser.setUserType(user.getUserType());
		existingUser.setUserEmail(user.getUserEmail());
		existingUser.setUserPassword(user.getUserPassword());
		existingUser.setUserPhone(user.getUserPhone());
		userRepo.save(existingUser);
		return existingUser;
	}

	// delete record
	@Override
	public void deleteUser(long Id) {
		User existingUser = userRepo.findById(Id).orElseThrow(() -> new ResourceNotFoundException("User", "Id", Id));
		userRepo.delete(existingUser);

	}

}
