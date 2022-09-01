package com.screen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.screen.entity.ScreenTb;


@Repository
public interface ScreenRepository extends JpaRepository< ScreenTb,Long>  {

}
