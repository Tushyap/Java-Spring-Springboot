package org.Globallogic.springboot.service;

import java.util.List;

import org.Globallogic.springboot.model.Employee;

public interface EmployeeService {
	
	// To add employee record 
	Employee saveEmployee(Employee employee);
	// To get employees records
	List<Employee> getAllEmployees();
	
	// get sepecific employee by Id
	Employee getEmpById(long Id);
	
	// update sepecific employee by Id
	Employee updateEmployee(Employee employee, long Id);
	
	// delete sepecific employee by Id
	void deleteEmployee(long Id);

}
