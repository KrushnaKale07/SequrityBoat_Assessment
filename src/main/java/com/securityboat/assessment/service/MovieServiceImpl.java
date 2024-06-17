package com.securityboat.assessment.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.securityboat.assessment.model.MovieModel;
import com.securityboat.assessment.repository.MovieRepository;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	MovieRepository movieRepository;

	@Override
	public MovieModel addNewMovie(@RequestBody MovieModel movieModel) {
		MovieModel result = null;
		try {
			result = movieRepository.save(movieModel);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public List<MovieModel> getAllMovies() {
		return movieRepository.findAll();
	}

	@Override
	public Optional<MovieModel> getMovieById(Integer id) {
		return movieRepository.findById(id);
	}

	@Override
	public MovieModel updateMovie(Integer id, MovieModel movieDetails) {
		
		Optional<MovieModel> optionalUser = movieRepository.findById(id);
		if (optionalUser.isPresent()) {
			MovieModel movieModel = optionalUser.get();

			movieModel.setMovieName(movieDetails.getMovieName());
			movieModel.setGenre(movieDetails.getGenre());
			movieModel.setShowtimes(movieDetails.getShowtimes());

			return movieRepository.save(movieModel);
		}
		return null;
	}

	@Override
	public void deleteMovie(Integer id) {
		if (movieRepository.existsById(id)) {
			movieRepository.deleteById(id);
		} else {
			throw new IllegalArgumentException("Movie with ID " + id + " does not exist");
		}
	}

}
