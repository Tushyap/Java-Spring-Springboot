package com.theater.service;

import java.util.List;

import com.theater.entity.TheaterTb;


public interface TheaterService {


	//save data 
	public TheaterTb saveTheater(TheaterTb theaterTb);

	//delete data
	public String deleteTheater(TheaterTb theaterTb);

	//get all data
	public List<TheaterTb> getAllTheater();

	// get single data 
	public TheaterTb getTheater(Long theaterId);

	// update data 
	public TheaterTb updateTheater(TheaterTb theaterTb);
}
