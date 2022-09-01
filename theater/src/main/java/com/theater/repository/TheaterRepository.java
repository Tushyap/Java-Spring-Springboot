package com.theater.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.theater.entity.TheaterTb;

public interface TheaterRepository extends JpaRepository<TheaterTb,Long>{

}
