package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.entity.Test;
import com.test.service.TestService;

@RestController
@RequestMapping("/test")
public class TestController {
 
	@Autowired
	private TestService testService;

	@PostMapping("/save")
	public Test saveTestData(@RequestBody Test test) {
		return testService.saveTest(test);
	}
	
	@GetMapping("/get")
	public List<Test> getTests(){
		return testService.getAllTests();
	}
	
	@GetMapping("/get/{id}")
	public Test getTestById(@PathVariable("id") Long Id) {
		return testService.getTestById(Id);
	}
}
