package com.securityboat.assessment.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.securityboat.assessment.model.SeatsModel;
import com.securityboat.assessment.model.TicketsModel;

@Repository
public interface TicketsRepository extends JpaRepository<TicketsModel, Integer> {

	Optional<SeatsModel> findById(Long ticketId);

	TicketsModel[] findBySeat(SeatsModel seatsModel);

}
