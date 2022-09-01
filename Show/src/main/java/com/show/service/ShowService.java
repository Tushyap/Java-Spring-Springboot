package com.show.service;

import java.util.List;

import com.show.entity.ShowTb;


public interface ShowService {
	// save show data 
	public ShowTb saveShow(ShowTb show);

	// get all show details in the form of list
	public List<ShowTb> getAllShow();

	// get show details by showId
	public ShowTb getShow(Long Id);

	// update show deatils 
	public ShowTb updateShow(ShowTb show);

	// delete show details 
	public String deleteShow(ShowTb show);

}
