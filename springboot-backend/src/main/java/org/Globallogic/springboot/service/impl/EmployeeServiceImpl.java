package org.Globallogic.springboot.service.impl;

import java.util.List;

import org.Globallogic.springboot.exception.ResourceNotFoundException;
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

	@Override
	public List<Employee> getAllEmployees() {	
		return employeeRepository.findAll();
	}

	@Override
	public Employee getEmpById(long Id) {
//		Optional<Employee> employee = employeeRepository.findById(Id);
//		if(employee.isPresent()) {
//			return employee.get();	
//			}else {
//				throw new ResourceNotFoundException("Employee","Id",Id);
//			}
		return  employeeRepository.findById(Id).orElseThrow( 
				()-> new ResourceNotFoundException ("Employee","Id",Id));
			
	}

	@Override
	public Employee updateEmployee(Employee employee, long Id) {
		Employee existingEmployee = employeeRepository.findById(Id).orElseThrow( 
				()-> new ResourceNotFoundException ("Employee","Id",Id));
		existingEmployee.setFirstName(employee.getFirstName());
		existingEmployee.setLastName(employee.getLastName());
		existingEmployee.setEmail(employee.getEmail());
		
		employeeRepository.save(existingEmployee);
		return existingEmployee;
	}

	@Override
	public void deleteEmployee(long Id) {
		Employee existEmployee = employeeRepository.findById(Id).orElseThrow( 
				()-> new ResourceNotFoundException ("Employee","Id",Id));
		employeeRepository.delete(existEmployee);
	}

}
