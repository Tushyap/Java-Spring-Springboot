package com.jpamapping.serviceImpl;


import org.springframework.stereotype.Service;

import com.jpamapping.model.Employee;
import com.jpamapping.repository.EmployeeRepository;
import com.jpamapping.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	private EmployeeRepository employeeRepository;
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	@Override
	public Employee saveEmployee(Employee employee) {

		return employeeRepository.save(employee);
	}


}
