package com.springboot.web;


import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.springboot.web.dao.UserRepository;
import com.springboot.web.entities.User;


@SpringBootApplication
public class BootjpaApplication {

	public static void main(String[] args) {
		//IOC
		ApplicationContext context = SpringApplication.run(BootjpaApplication.class, args);

		//DI		
		UserRepository userRepository = context.getBean(UserRepository.class);

		// assinging values to the constructor
		// CRUD operation
		// object of user class
		
		User userOne = new User();
		userOne.setName("Rahul");
		userOne.setCity("Jaipur");
		userOne.setStatus("Active");
		
		User userObj = new User();
		userObj.setName("Niraj");
		userObj.setCity("Jaipur");
		userObj.setStatus("Active");
		
		// add data to the database
        // User userInfo = userRepository.save(userObj);
        // System.out.println(userInfo);
		
		// add multiple data to database
		List<User> users = List.of(userOne, userObj);
		Iterable<User> result = userRepository.saveAll(users);
		result.forEach(user ->{
			System.out.println(user);
		});
		
		// read data from data base
		Optional<User>	option=userRepository.findById(7);
		System.out.println(option);
		
		// read all data from database
		Iterable<User>	options=userRepository.findAll();
		options.forEach(optionObj ->{
			System.out.println(optionObj);
		});		
		
		// update data 		
	    Optional<User>	optional=userRepository.findById(9);
	    User userObject = optional.get(); // true
	    userObject.setName("Tushar");
	    userObject.setCity("Lucknow");
	    userObject.setStatus("Active");
	    User displays = userRepository.save(userObject);
	    System.out.println(displays);
	    
	    // Delete data    
	    userRepository.deleteById(10);
	    System.out.println("Record Deleted.....");
	    
				
	}

}
