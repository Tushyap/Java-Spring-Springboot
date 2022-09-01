package com.theater.controller;

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
import com.theater.entity.Movie;
import com.theater.entity.Screen;
import com.theater.entity.Theater;
import com.theater.entity.TheaterTb;
import com.theater.service.TheaterService;

@RestController
@RequestMapping("/theater")
public class TheaterController {

	@Autowired
	private TheaterService theaterService;

	@Autowired
	private RestTemplate restTemplate;

	// save data to database 
	@PostMapping("/save")
	public Theater saveTheater(@RequestBody Theater theater) {
		TheaterTb temp = new TheaterTb();
		temp.setTheaterName(theater.getTheaterName());
		temp.setTheaterCity(theater.getTheaterCity());
		List<Long> list = new ArrayList<Long>();
		for (Movie movie : theater.getMovies()) {
			list.add(movie.getMovieId());
		}
		temp.setMovieIds(list);
		list = new ArrayList<Long>();
		for (Screen screen : theater.getListOfScreens()) {
			list.add(screen.getScreenId());
		}
		temp.setListOfScreenIds(list);
		temp.setManagerName(theater.getManagerName());
		temp.setManagerContact(theater.getManagerContact());
		theaterService.saveTheater(temp);
		theater.setTheaterId(temp.getTheaterId());
		return theater;

	}

	// get all data from database 
	@GetMapping("/get")
	public List<Theater> showTheaters() {
		List<TheaterTb> list = theaterService.getAllTheater();
		List<Theater> lists = new ArrayList<Theater>();
		for (TheaterTb temp : list) {
			Theater theater = new Theater();
			theater.setTheaterName(temp.getTheaterName());
			theater.setTheaterCity(temp.getTheaterCity());
			List<Movie> movies = new ArrayList<Movie>();
			for (Long movieObj : temp.getMovieIds()) {
				movies.add(restTemplate.getForObject("http://localhost:5055/movie/get/" + movieObj, Movie.class));
			}
			theater.setMovies(movies);
			theater.getMovies();
			List<Screen> screens = new ArrayList<Screen>();
			for (Long screenObj : temp.getListOfScreenIds()) {
				screens.add(restTemplate.getForObject("http://localhost:6060/screen/get/" + screenObj, Screen.class));
			}
			theater.setListOfScreens(screens);
			theater.setManagerName(temp.getManagerName());

			theater.setManagerContact(temp.getManagerContact());
			theater.setTheaterId(temp.getTheaterId());
			lists.add(theater);
		}
		return lists;
	}

	// get single data by Id 
	@GetMapping("/get/{id}")
	public Theater getTheaterById(@PathVariable("id") Long Id) {
		TheaterTb theaterObject = theaterService.getTheater(Id);
		Theater theater = new Theater();
		theater.setTheaterId(theaterObject.getTheaterId());
		theater.setTheaterName(theaterObject.getTheaterName());
		theater.setTheaterCity(theaterObject.getTheaterCity());
		List<Movie> movies = new ArrayList<Movie>();
		for (Long movieObj : theaterObject.getMovieIds()) {
			movies.add(restTemplate.getForObject("http://localhost:5055/movie/get/" + movieObj, Movie.class));
		}
		theater.setMovies(movies);
		theater.getMovies();
		List<Screen> screens = new ArrayList<Screen>();
		for (Long screenObj : theaterObject.getListOfScreenIds()) {
			screens.add(restTemplate.getForObject("http://localhost:6060/screen/get/" + screenObj, Screen.class));
		}
		theater.setListOfScreens(screens);
		theater.setManagerName(theaterObject.getManagerName());
		theater.setManagerContact(theaterObject.getManagerContact());
		return theater;
	}

	// update data in database
	@PutMapping("/update/{id}")
	public Theater updateTheater(@PathVariable("id") Long id, @RequestBody Theater theater) {
		TheaterTb temp = theaterService.getTheater(id);
		temp.setTheaterName(theater.getTheaterName());
		temp.setTheaterCity(theater.getTheaterCity());
		List<Long> list = new ArrayList<Long>();
		for (Movie movie : theater.getMovies()) {
			list.add(movie.getMovieId());
		}
		temp.setMovieIds(list);
		list = new ArrayList<Long>();
		for (Screen screen : theater.getListOfScreens()) {
			list.add(screen.getScreenId());
		}
		temp.setListOfScreenIds(list);
		temp.setManagerName(theater.getManagerName());
		temp.setManagerContact(theater.getManagerContact());
		theaterService.updateTheater(temp);
		return theater;

	}

	// delete data from database
	@DeleteMapping("/delete/{id}")
	public String deleteTheater(@PathVariable("id") Long id) {
		return theaterService.deleteTheater(theaterService.getTheater(id));
	}
}
