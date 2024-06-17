package com.securityboat.assessment.service;

import java.util.List;
import java.util.Optional;

import com.securityboat.assessment.model.MovieModel;

public interface MovieService {
	
	public MovieModel addNewMovie(MovieModel movieModel);
	
	public List<MovieModel> getAllMovies();

	public Optional<MovieModel> getMovieById(Integer id);

	public MovieModel updateMovie(Integer id, MovieModel userDetails);

	public void deleteMovie(Integer id);
}
