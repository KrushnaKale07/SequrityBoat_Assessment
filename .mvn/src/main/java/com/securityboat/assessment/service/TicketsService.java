package com.securityboat.assessment.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.securityboat.assessment.model.SeatsModel;
import com.securityboat.assessment.model.TicketsModel;
import com.securityboat.assessment.repository.SeatsRepository;
import com.securityboat.assessment.repository.TicketsRepository;
import com.securityboat.assessment.repository.UserRegistrationRepository;

@Service
public class TicketsService {

	private final SeatsRepository seatsRepository;
	private final TicketsRepository ticketsRepository;
	private final UserRegistrationRepository userRegistrationRepository;

	public TicketsService(SeatsRepository seatsRepository, TicketsRepository ticketsRepository,
			UserRegistrationRepository userRegistrationRepository) {
		this.seatsRepository = seatsRepository;
		this.ticketsRepository = ticketsRepository;
		this.userRegistrationRepository = userRegistrationRepository;
	}

	public List<SeatsModel> getAvailableSeats() {
		return seatsRepository.findAllByBooked(false);
	}

	public void bookSeat(Long seatId, Integer quantity) {
		SeatsModel seatsModel = seatsRepository.findById(seatId).orElseThrow();
		if (seatsModel.isBooked()) {
			throw new RuntimeException("Seat is already booked");
		}
		for (int i = 0; i < quantity; i++) {
			TicketsModel ticketsModel = new TicketsModel(seatsModel, 1);
			ticketsRepository.save(ticketsModel);
			seatsModel.setBooked(true);
		}
		seatsRepository.save(seatsModel);
	}

	public void cancelBooking(Long ticketId) {
		SeatsModel ticketsModel = ticketsRepository.findById(ticketId).orElseThrow();
		SeatsModel seatsModel = ticketsModel.getSeatId();
		if (!seatsModel.isBooked()) {
			throw new RuntimeException("Seat is not booked");
		}
		for (TicketsModel t : ticketsRepository.findBySeat(seatsModel)) {
			ticketsRepository.delete(t);
		}
		seatsModel.setBooked(false);
		seatsRepository.save(seatsModel);
	}
}
