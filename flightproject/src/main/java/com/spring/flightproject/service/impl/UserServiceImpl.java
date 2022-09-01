package com.spring.flightproject.service.impl;

import com.spring.flightproject.exception.ResourceNotFoundException;
import com.spring.flightproject.models.User;
import com.spring.flightproject.repository.UserRepository;
import com.spring.flightproject.service.UserService;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
	private UserRepository userRepository;
	
	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository=userRepository;
	}


	@Override
	public User saveUser(User User) {
		return  userRepository.save(User);
	}

	@Override
	public List<User> getAllUsers() {	
		return userRepository.findAll();
	}

	@Override
	public User getUserById(int Id) {
//		Optional<User> User = UserRepository.findById(Id);
//		if(User.isPresent()) {
//			return User.get();	
//			}else {
//				throw new ResourceNotFoundException("User","Id",Id);
//			}
		return  userRepository.findById(Id).orElseThrow( 
				()-> new ResourceNotFoundException ("User","Id",Id));
			
	}

	@Override
	public User updateUser(User user, int Id) {
		User existingUser = userRepository.findById(Id).orElseThrow( 
				()-> new ResourceNotFoundException ("User","Id",Id));
		existingUser.setUserId(user.getUserId());
		existingUser.setUserType(user.getUserType());
		existingUser.setUserName(user.getUserName());
		existingUser.setUserPassword(user.getUserPassword());
		existingUser.setUserPhone(user.getUserPhone());
		existingUser.setEmail(user.getEmail());
		
		userRepository.save(existingUser);
		return existingUser;
	}

	@Override
	public void deleteUser(int Id) {
		User existUser = userRepository.findById(Id).orElseThrow( 
				()-> new ResourceNotFoundException ("User","Id",Id));
		userRepository.delete(existUser);
	}


	

}
