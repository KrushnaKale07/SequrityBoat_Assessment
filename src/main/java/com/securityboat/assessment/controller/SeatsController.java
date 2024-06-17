package com.securityboat.assessment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.securityboat.assessment.model.SeatsModel;
import com.securityboat.assessment.service.SeatsServiceImpl;

@RestController
@RequestMapping("/seats")
public class SeatsController {

	@Autowired
	private SeatsServiceImpl seatServiceImpl;

	@GetMapping("/{movie}")
	public List<SeatsModel> getSeatsByMovie(@PathVariable String movie) {
		return seatServiceImpl.getSeatsByMovie(movie);
	}

	@PostMapping("/book/{seatId}")
	public SeatsModel bookSeatById(@PathVariable int seatId) {
		return seatServiceImpl.bookSeat(seatId);
	}
}
