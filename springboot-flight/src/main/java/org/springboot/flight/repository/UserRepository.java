package org.springboot.flight.repository;

import org.springboot.flight.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Spring Data JPA internally provides annotation
@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	//JPA repository have all the required methods to communicate with database ---
}
