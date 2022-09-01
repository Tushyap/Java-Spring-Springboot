package com.spring.flightproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.flightproject.models.User;

public interface UserRepository extends JpaRepository<User ,Integer>{

}
