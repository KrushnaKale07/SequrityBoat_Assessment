package com.securityboat.assessment.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tickets")
public class TicketsModel {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;
	    private SeatsModel  seat;
	    private int quantity;
	    
	    
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public SeatsModel getSeatId() {
			return seat;
		}
		public void setSeatId(SeatsModel seatId) {
			this.seat = seatId;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		
		public TicketsModel(SeatsModel seatsModel, int i) {
		}
	    
}
