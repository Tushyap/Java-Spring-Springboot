package com.jpamapping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpamapping.model.Employee;
import com.jpamapping.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmpolyeeController {

	@Autowired
	private EmployeeService employeeService;

	public EmpolyeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}

	// build create employee rest api
	@PostMapping("/employee")
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
		return new ResponseEntity<Employee>(employeeService.saveEmployee(employee), HttpStatus.CREATED);
	}
	
}
