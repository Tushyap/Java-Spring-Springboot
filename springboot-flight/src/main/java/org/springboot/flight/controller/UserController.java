package org.springboot.flight.controller;

import java.util.List;
import org.springboot.flight.model.User;
import org.springboot.flight.service.UserService;
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
@RequestMapping("/api")
public class UserController {

	// data variable for services
	@Autowired
	private UserService userService;

	// constructor
	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}

	// post request method
	@PostMapping()
	public ResponseEntity<User> saveEmployee(@RequestBody User user) {
		return new ResponseEntity<User>(userService.saveUser(user), HttpStatus.CREATED);
	}

	// GET request method
	@GetMapping()
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}

	// GET request method from Id
	@GetMapping("/{id}")
	public ResponseEntity<User> getUserById(@PathVariable("id") long Id) {
		return new ResponseEntity<User>(userService.getOneUser(Id), HttpStatus.OK);
	}

	// UPDATE request method
	@PutMapping("/{id}")
	public ResponseEntity<User> updateUserDetails(@PathVariable("id") long Id, @RequestBody User user) {
		return new ResponseEntity<User>(userService.updateUser(user, Id), HttpStatus.OK);
	}

	// DELETE request MEthod
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteUserDetails(@PathVariable("id") long Id) {
		userService.deleteUser(Id);
		return new ResponseEntity<String>("User record delete ", HttpStatus.OK);
	}

	@PostMapping("/login")
	public void verifyUser(@RequestBody User user) {
		List<User> users = userService.getAllUsers();
		for (User validUser : users) {
			if (validUser.equals(user)) {
				userService.saveUser(user);
				System.out.println("user loggedin");
			} else {
				System.out.println("Invalid User");
			}

		}
	}

}
