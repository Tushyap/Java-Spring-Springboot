package com.screen.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.screen.entity.ScreenTb;
import com.screen.exception.ResourceNotFoundException;
import com.screen.repository.ScreenRepository;
import com.screen.service.ScreenService;

@Service
public class ScreenServiceImpl implements ScreenService {

	@Autowired
	private ScreenRepository screenRepository;

	
	public ScreenServiceImpl(ScreenRepository screenRepository) {
		super();
		this.screenRepository = screenRepository;
	}

	@Override
	public ScreenTb saveScreen(ScreenTb screen) {
		return screenRepository.save(screen);
	}

	@Override
	public List<ScreenTb> getAllScreen() {
		return screenRepository.findAll();
	}

	@Override
	public ScreenTb getScreen(Long Id) {	
		return screenRepository.findById(Id).orElseThrow(
				()-> new ResourceNotFoundException("ScreenTb","screenId",Id));
	}

	@Override
	public ScreenTb updateScreen(ScreenTb screen) {
		return screenRepository.save(screen);
	}

	@Override
	public String deleteScreen(ScreenTb screen) {
		Long id = screen.getScreenId();
		screenRepository.delete(screen);
		return "Screen  "+ id+"  deleted...";
	}
	
}
