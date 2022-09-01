package com.test.service;

import java.util.List;

import com.test.entity.Test;

public interface TestService {

	public Test saveTest(Test test);
    // get all tests 
	public List<Test> getAllTests();
	
	// get one Test
	public Test getTestById(Long Id);
	
}
