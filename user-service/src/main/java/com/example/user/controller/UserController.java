package com.example.user.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.user.entity.User;
import com.example.user.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	// User Registration
		@PostMapping()
		public ResponseEntity<User>createUser(@RequestBody User user)
		{
			return new ResponseEntity<User>(userService.registerNewUser(user),HttpStatus.CREATED);
		}
		
		// getting all users
		@GetMapping()
		public List<User> getAllUser()
		{
			return userService.getAllUser();	
		}
		
		@GetMapping("/{userId}")
		public User getUserById(@PathVariable("userId")Long userId)
		{
			System.out.println("inside controller  "+userService.getUserById(userId));
			return userService.getUserById(userId);	
		}
		
		// user signIn method
		@PostMapping("/signIn")
		public String signIn(@RequestBody User user)
		{
			return userService.signIn(user.getUsername(), user.getPassword());
		}
		
		// user SignOut Method
		@GetMapping("/signOut/{userId}")
		public String logout(@PathVariable("userId")Long userId)
		{
			return userService.signOut(userId);
		}
		
		// user delete all user method
		@DeleteMapping("/all")
		public String deleteAll()
		{
			userService.deleteAll();
			return "All users are deleted Successfully";
		}
		
		// delete user by id
		@DeleteMapping("/{userId}")
		public ResponseEntity<User> deleteById(@PathVariable("userId")Long userId)
		{
			User user=userService.getUserById(userId);
			userService.deleteById(userId);
			return new ResponseEntity<User>(user,HttpStatus.OK);
			
			
		}

}
