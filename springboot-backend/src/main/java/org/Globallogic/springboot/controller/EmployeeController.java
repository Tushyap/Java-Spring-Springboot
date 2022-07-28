package org.Globallogic.springboot.controller;

import java.util.List;

import org.Globallogic.springboot.model.Employee;
import org.Globallogic.springboot.service.EmployeeService;
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
@RequestMapping("/api/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService= employeeService;
	}
	
	// build create employee rest api
	@PostMapping()
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
		return new ResponseEntity<Employee>(employeeService.saveEmployee(employee), HttpStatus.CREATED);
	}
	
	// build a method to get employees 
    @GetMapping()
	public  List<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();
	}
    
    // Build method to get single employee
    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmpById(@PathVariable("id") long Id){
    	return new ResponseEntity<Employee>(employeeService.getEmpById(Id), HttpStatus.OK);
    }
    
    // Build method to update a specific employee details
    @PutMapping("/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable("id") long Id, @RequestBody Employee employee){
    	return new ResponseEntity<Employee>(employeeService.updateEmployee(employee,Id), HttpStatus.OK);
    }
    
    // Build Method to delete specific employee details 
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable("id") long Id){
    	employeeService.deleteEmployee(Id);
    	return new ResponseEntity<String>("Employee record delete ", HttpStatus.OK);
    }
    
}
