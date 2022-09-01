package com.screen.service;

import java.util.List;

import com.screen.entity.ScreenTb;

public interface ScreenService {

	// save data
	public ScreenTb saveScreen(ScreenTb screen);
	
	// get all data 
	public List<ScreenTb> getAllScreen();

	// get data by Id
	public ScreenTb getScreen(Long Id);
	
	// update data
	public ScreenTb updateScreen(ScreenTb screen);
	
	// delete data
	public String deleteScreen(ScreenTb screen);
}
