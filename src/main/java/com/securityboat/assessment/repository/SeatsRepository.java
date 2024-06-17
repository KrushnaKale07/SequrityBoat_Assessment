package com.securityboat.assessment.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.securityboat.assessment.model.SeatsModel;

@Repository
public interface SeatsRepository extends JpaRepository<SeatsModel, Integer> {

	List<SeatsModel> findByMovie(String movie);

	List<SeatsModel> findAllByBooked(boolean b);

	Optional<SeatsModel> findById(Long seatId);
}
