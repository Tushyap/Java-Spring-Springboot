package com.theater.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.theater.entity.TheaterTb;
import com.theater.exception.ResourceNotFoundException;
import com.theater.repository.TheaterRepository;

@Service
public class TheaterServiceImpl implements TheaterService {

	@Autowired
	private TheaterRepository theaterRepository;

	@Override
	public TheaterTb saveTheater(TheaterTb theaterTb) {
		return theaterRepository.save(theaterTb);
	}

	@Override
	public List<TheaterTb> getAllTheater() {
		return theaterRepository.findAll();
	}
	
	@Override
	public TheaterTb getTheater(Long theaterId) {
		return theaterRepository.findById(theaterId)
				.orElseThrow(() -> new ResourceNotFoundException("Theater", "theaterId", theaterId));
	}

	@Override
	public TheaterTb updateTheater(TheaterTb theaterTb) {
		return theaterRepository.save(theaterTb);
	}


	@Override
	public String deleteTheater(TheaterTb theaterTb) {
		Long id = theaterTb.getTheaterId();
		theaterRepository.delete(theaterTb);
		return "Theater "+ id + " deleted";
	}


}
