package com.movie.service;

import java.util.List;
import com.movie.model.Movie;

public interface MovieService {

	//save movie
	public Movie saveMovie(Movie movie); 
	
	//get movies
	public List<Movie>  getMovies();
	
	// get one Movie
	public Movie getMovieById(Long Id);
	
	// update Movie
	public Movie updateMovie(Movie movie, Long Id);
	
	// delete Movie
	public void deleteMovie(Long Id);
}
