package com.securityboat.assessment.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users_account")
public class UserRegistrationModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userID;
	
	private String firstName;
	private String lastName;
	private String emailid;
	private String password;
	
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailID() {
		return emailid;
	}
	public void setEmailID(String emailid) {
		this.emailid = emailid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	@Override
	public String toString() {
		return "UserRegistrationModel [userID=" + userID + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", emailid=" + emailid + ", password=" + password + "]";
	}
	
	
	
	
}
