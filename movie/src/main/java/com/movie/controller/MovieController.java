package com.movie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.movie.model.Movie;
import com.movie.service.MovieService;

@RestController
@RequestMapping("/movie")
public class MovieController {

	@Autowired
	private MovieService movieService;
	
	@PostMapping("/save")
	public ResponseEntity<Movie> saveMovie(@RequestBody Movie movie){
		return new ResponseEntity<Movie>(movieService.saveMovie(movie),HttpStatus.CREATED);		
	}
	
	@GetMapping("/get")
	public List<Movie> getMovies(){
		return movieService.getMovies();
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<Movie> getMovie(@PathVariable("id") Long Id){
		return new ResponseEntity<Movie>(movieService.getMovieById(Id),HttpStatus.CREATED);		
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Movie> updateMovie(@PathVariable("id") Long Id,@RequestBody Movie movie){
		return new ResponseEntity<Movie>(movieService.updateMovie(movie, Id),HttpStatus.CREATED);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteMovie(@PathVariable("id") Long Id){
		movieService.deleteMovie(Id);
		return new ResponseEntity<String>("Movie deleted...", HttpStatus.OK);
	}
}
