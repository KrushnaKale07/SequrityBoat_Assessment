package com.securityboat.assessment.model;

import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "seats")
public class SeatsModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "INT")
	private int id;
	private String movie;

	@Column(columnDefinition = "INT")
	private int line;

	@Column(columnDefinition = "INT")
	private int col;
	private boolean booked;

	@Column(nullable = false)
	private String seatNumber;

	@Temporal(TemporalType.DATE)
	private Date bookingDate;

	public String getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMovie() {
		return movie;
	}

	public void setMovie(String movie) {
		this.movie = movie;
	}

	public int getLine() {
		return line;
	}

	public void setLine(int line) {
		this.line = line;
	}

	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
	}

	public boolean isBooked() {
		return booked;
	}

	public void setBooked(boolean booked) {
		this.booked = booked;
	}

	public SeatsModel getSeatId() {
		return null;
	}

	public SeatsModel() {
	}

	// parameterized constructor
	public SeatsModel(String seatNumber) {
		this.seatNumber = seatNumber;
	}

	@Override
	public String toString() {
		return "SeatsModel [id=" + id + ", movie=" + movie + ", line=" + line + ", col=" + col + ", booked=" + booked
				+ ", seatNumber=" + seatNumber + "]";
	}
}
