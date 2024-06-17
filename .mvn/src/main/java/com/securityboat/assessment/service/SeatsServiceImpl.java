package com.securityboat.assessment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.securityboat.assessment.model.SeatsModel;
import com.securityboat.assessment.repository.SeatsRepository;

@Service
public class SeatsServiceImpl implements SeatsService {

	@Autowired
	SeatsRepository seatsRepository;
	
	@Override
	public List<SeatsModel> getSeatsByMovie(String movie) {
        return seatsRepository.findByMovie(movie);
    }

	@Override
    public SeatsModel bookSeat(int seatId) {
    	SeatsModel seatsModel = seatsRepository.findById(seatId).orElseThrow(() -> new IllegalArgumentException("Invalid seat ID"));
        if (seatsModel.isBooked()) {
            throw new IllegalStateException("Seat already booked");
        }
        seatsModel.setBooked(true);
        return seatsRepository.save(seatsModel);
    }
}
