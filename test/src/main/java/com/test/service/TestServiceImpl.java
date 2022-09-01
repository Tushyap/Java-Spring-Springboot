package com.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.entity.Test;
import com.test.repository.TestRepository;

@Service
public class TestServiceImpl implements TestService {

	@Autowired
	private TestRepository testRepo;
	
	@Override
	public Test saveTest(Test test) {
		
		return testRepo.save(test);
	}

	@Override
	public List<Test> getAllTests() {
		// TODO Auto-generated method stub
		return testRepo.findAll();
	}

	@Override
	public Test getTestById(Long Id) {
		// TODO Auto-generated method stub
		return testRepo.findById(Id).get();
	}

}
