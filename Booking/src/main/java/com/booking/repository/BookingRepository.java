package com.booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.booking.entity.BookingTb;

public interface BookingRepository extends JpaRepository<BookingTb , Long>{

}
