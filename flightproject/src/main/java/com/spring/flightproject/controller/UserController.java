package com.spring.flightproject.controller;

import java.util.List;

import com.spring.flightproject.models.User;
import com.spring.flightproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/User")
public class UserController {

	@Autowired
	private UserService userService;
	
	public UserController(UserService userService) {
		super();
		this.userService= userService;
	}
	
	// build create User rest api
	@PostMapping()
	public ResponseEntity<User> saveUser(@RequestBody User User){
		return new ResponseEntity<User>(userService.saveUser(User), HttpStatus.CREATED);
	}
	
	// build a method to get Users 
    @GetMapping()
	public  List<User> getAllUsers(){
		return userService.getAllUsers();
	}
    
    // Build method to get single User
    @GetMapping("/{id}")
    public ResponseEntity<User> getEmpById(@PathVariable("id") int Id){
    	return new ResponseEntity<User>(userService.getUserById(Id), HttpStatus.OK);
    }
    
    // Build method to update a specific User details
    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@PathVariable("id") int Id, @RequestBody User User){
    	return new ResponseEntity<User>(userService.updateUser(User,Id), HttpStatus.OK);
    }
    
    // Build Method to delete specific User details 
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable("id") int Id){
    	userService.deleteUser(Id);
    	return new ResponseEntity<String>("User record delete ", HttpStatus.OK);
    }
    
}