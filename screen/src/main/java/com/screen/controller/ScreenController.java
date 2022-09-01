package com.screen.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.screen.entity.Screen;
import com.screen.entity.ScreenTb;
import com.screen.entity.Show;
import com.screen.service.ScreenService;

@RestController
@RequestMapping("/screen")
public class ScreenController {

	@Autowired
	private ScreenService screenService;

	@Autowired
	private RestTemplate restTemplate;
	
     // save data in database 
	@PostMapping("/save")
	public Screen saveScreen(@RequestBody Screen screen) {

		ScreenTb screenTemp = new ScreenTb();
		screenTemp.setTheaterId(screen.getTheaterId());
		screenTemp.setScreenName(screen.getScreenName());
		List<Long> list = new ArrayList<Long>();
		for (Show show : screen.getShowList()) {
			list.add(show.getShowId());
		}
		screenTemp.setShowIds(list);
		screenTemp.setRowsCount(screen.getRowsCount());
		screenTemp.setColumnsCount(screen.getColumnsCount());
		screenTemp = screenService.saveScreen(screenTemp);
		screen.setScreenId(screenTemp.getScreenId());
		return screen;
	}

	// show all data from table in the form of list
	@GetMapping("/get")
	public List<Screen> showScreen() {
		List<ScreenTb> list = screenService.getAllScreen();
		List<Screen> listTwo = new ArrayList<Screen>();
		for (ScreenTb temp : list) {
			Screen screen = new Screen();
			screen.setScreenId(temp.getScreenId());
			screen.setTheaterId(temp.getTheaterId());
			screen.setScreenName(temp.getScreenName());
			for (Long showObj : temp.getShowIds()) {
				screen.getShowList()
						.add(restTemplate.getForObject("http://localhost:8113/show/get/" + showObj, Show.class));
			}
			screen.setRowsCount(temp.getRowsCount());
			screen.setColumnsCount(temp.getColumnsCount());
			listTwo.add(screen);
		}
		return listTwo;
	}

	//show data by id
	@GetMapping("/get/{id}")
	public Screen getScreenById(@PathVariable("id") Long Id) {
		ScreenTb screenTemp = screenService.getScreen(Id);
		Screen screen = new Screen();
		screen.setScreenId(screenTemp.getScreenId());
		screen.setTheaterId(screenTemp.getTheaterId());
		screen.setScreenName(screenTemp.getScreenName());
		for (Long showObj : screenTemp.getShowIds()) {
			screen.getShowList()
					.add(restTemplate.getForObject("http://localhost:8113/show/get/" + showObj, Show.class));
		}
		screen.setRowsCount(screenTemp.getRowsCount());
		screen.setColumnsCount(screenTemp.getColumnsCount());
		return screen;
	}

	// update specific data 
	@PutMapping("/update/{id}")
	public Screen updateScreen(@PathVariable("id") Long Id, @RequestBody Screen screen) {
		ScreenTb screenTemp = new ScreenTb();
		screenTemp.setScreenId(screen.getScreenId());
		screenTemp.setTheaterId(screen.getTheaterId());
		screenTemp.setScreenName(screen.getScreenName());
		List<Long> list = new ArrayList<Long>();
		for (Show show : screen.getShowList()) {
			list.add(show.getShowId());
			restTemplate.put("http://localhost:8113/show/update/" + show.getShowId(), show, Show.class);
		}
		screenTemp.setShowIds(list);
		screenTemp.setRowsCount(screen.getRowsCount());
		screenTemp.setColumnsCount(screen.getColumnsCount());
		screenTemp = screenService.updateScreen(screenTemp);
		return restTemplate.getForObject("http://localhost:6060/screen/get/" + screenTemp.getScreenId(), Screen.class);
	}

	// delete data from table 
	@DeleteMapping("/delete/{id}")
	public String deleteScreen(@PathVariable("id") Long id) {
		return screenService.deleteScreen(screenService.getScreen(id));
	}
}
