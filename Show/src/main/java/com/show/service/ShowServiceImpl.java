package com.show.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.show.entity.ShowTb;
import com.show.repository.ShowRepository;

@Service
public class ShowServiceImpl implements ShowService{

	
	@Autowired
	private ShowRepository showRepository;
		
    // saves data in database 
	@Override
	public ShowTb saveShow(ShowTb show) {
		return showRepository.save(show);
	}

	// deletes data from data base 
	@Override
	public String deleteShow(ShowTb show) {
		Long id=show.getShowId();
		showRepository.delete(show);
		return "Show "+id+" deleted.";
	}

	// get all data from database in form of list
	@Override
	public List<ShowTb> getAllShow() {
		return showRepository.findAll();
	}

	//get specific data using Id 
	@Override
	public ShowTb getShow(Long Id) {
		return showRepository.findById(Id).get();
	}

	// update details 
	@Override
	public ShowTb updateShow(ShowTb show) {
		return showRepository.save(show);
	}

}
