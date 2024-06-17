package com.securityboat.assessment.service;

import java.util.List;

import com.securityboat.assessment.model.SeatsModel;

public interface SeatsService {

	public List<SeatsModel> getSeatsByMovie(String movie);
	
	public SeatsModel bookSeat(int seatId);
}
