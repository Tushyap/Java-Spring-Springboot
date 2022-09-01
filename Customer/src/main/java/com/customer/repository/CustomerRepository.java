package com.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.customer.entity.CustomerTb;

public interface CustomerRepository extends JpaRepository<CustomerTb, Long>{

}
