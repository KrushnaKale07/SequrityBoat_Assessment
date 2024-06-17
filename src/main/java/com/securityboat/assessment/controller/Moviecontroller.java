package com.securityboat.assessment.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.securityboat.assessment.model.MovieModel;
import com.securityboat.assessment.service.MovieServiceImpl;

@RestController
@RequestMapping("/booking")
public class Moviecontroller {



	@Autowired
	MovieServiceImpl movieServiceImpl;

	@PostMapping("/create")
	public MovieModel registration(@RequestBody MovieModel movieModel) {
		MovieModel result = null;
		try {
			result = movieServiceImpl.addNewMovie(movieModel);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@GetMapping
	public List<MovieModel> getAllUsers() {
		return movieServiceImpl.getAllMovies();
	}

	@GetMapping("/{id}")
	public Optional<MovieModel> getMovieById(@PathVariable Integer id) {
		return movieServiceImpl.getMovieById(id);
	}
	
	@PutMapping("/{id}")
    public MovieModel updateMovieById(@PathVariable Integer id, @RequestBody MovieModel userDetails) {
        return movieServiceImpl.updateMovie(id, userDetails);
    }
	
	 @DeleteMapping("/{id}")
	 public void deleteMovieById(@PathVariable Integer id) {
		 movieServiceImpl.deleteMovie(id);
	 }
	
}
