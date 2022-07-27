package org.Globallogic.springboot.repository;

import org.Globallogic.springboot.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Spring Data JPA internally provides annotation
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
