package com.securityboat.assessment.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "movies")
public class MovieModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int movieID;
	private String movieName;
	private String genre;
	
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date showtimes;

	public int getMovieID() {
		return movieID;
	}

	public void setMovieID(int movieID) {
		this.movieID = movieID;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public Date getShowtimes() {
		return showtimes;
	}

	public void setShowtimes(Date showtimes) {
		this.showtimes = showtimes;
	}

	@Override
	public String toString() {
		return "MovieModel [movieID=" + movieID + ", movieName=" + movieName + ", genre=" + genre + ", showtimes="
				+ showtimes + "]";
	}
}
