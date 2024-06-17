package com.securityboat.assessment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.securityboat.assessment.model.MovieModel;

@Repository
public interface MovieRepository extends JpaRepository<MovieModel, Integer> {

}
