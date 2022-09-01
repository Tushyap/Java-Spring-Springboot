package com.jpamapping.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jpamapping.model.Employee;

@Repository
public interface EmployeeRepository  extends CrudRepository<Employee , Long>{

}
