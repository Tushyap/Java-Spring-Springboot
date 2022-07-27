package org.Globallogic.springboot.service.impl;

import org.Globallogic.springboot.model.Employee;
import org.Globallogic.springboot.repository.EmployeeRepository;
import org.Globallogic.springboot.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	//setter based dependency injecttion 
	// constructor based dependency injection
	
	private EmployeeRepository employeeRepository;
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}
	
	@Override
	public Employee saveEmployee(Employee employee) {
		return  employeeRepository.save(employee);
	}

}
