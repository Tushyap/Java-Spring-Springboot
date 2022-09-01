package com.example.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.user.entity.User;
import com.example.user.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public User registerNewUser(User user) {
		return userRepository.save(user);
	}

	public List<User> getAllUser() {
		
		return userRepository.findAll();
	}

	public User getUserById(Long userId) {
		return userRepository.findByUserId(userId);
	}

	public String signIn(String username, String password) {
		User user=userRepository.findByUsernameAndPassword(username,password);
		user.setLogin(true);
		userRepository.save(user);
		return "Welcome To Movie Ticket Booking!!!! \n You have Succesfully Logged In" ;
	}

	public String signOut(Long userId) {
		User user=userRepository.findByUserId(userId);
		if(user.getLogin()==true)
		{
			user.setLogin(false);
			userRepository.save(user);
			return ("Successfully LogOut User: "+user.getUsername());
		}
		else 
			return "You Haven't Login yet";
	}

	public void deleteAll() {
		userRepository.deleteAll();
		
	}

	public void deleteById(Long userId) {
		userRepository.deleteById(userId);
		
	}

	
	
	
	
}
