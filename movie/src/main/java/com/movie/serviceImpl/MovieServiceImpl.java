package com.movie.serviceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.exception.ResourceNotFoundException;
import com.movie.model.Movie;
import com.movie.repository.MovieRepository;
import com.movie.service.MovieService;



@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieRepository movieRepository;
	
	@Override
	public Movie saveMovie(Movie movie) {
		return movieRepository.save(movie);
	}

	@Override
	public List<Movie> getMovies() {
		return movieRepository.findAll();
	}

	@Override
	public Movie getMovieById(Long Id) {
		return movieRepository.findById(Id).orElseThrow(
				()-> new ResourceNotFoundException("Movie","movieId",Id));
	}

	@Override
	public void deleteMovie(Long Id) {
		Movie existMovie =movieRepository.findById(Id).orElseThrow(
				()-> new ResourceNotFoundException("Movie","movieId",Id));
		movieRepository.delete(existMovie);
	}

	@Override
	public Movie updateMovie(Movie movie, Long Id) {
		Movie existingMovie =movieRepository.findById(Id).orElseThrow(
				()-> new ResourceNotFoundException("Movie","movieId",Id));
		existingMovie.setMovieName(movie.getMovieName());
		existingMovie.setMovieGenre(movie.getMovieGenre());
		existingMovie.setMovieDirector(movie.getMovieDirector());
		existingMovie.setLanguages(movie.getLanguages());
		existingMovie.setMovieLength(movie.getMovieLength());
		existingMovie.setMovieReleaseDate(movie.getMovieReleaseDate());
		movieRepository.save(existingMovie);
		return existingMovie;
	}

}
