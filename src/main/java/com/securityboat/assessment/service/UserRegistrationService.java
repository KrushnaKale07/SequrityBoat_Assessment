package com.securityboat.assessment.service;

import java.util.List;
import java.util.Optional;

import com.securityboat.assessment.model.UserRegistrationModel;

public interface UserRegistrationService {

	
	public UserRegistrationModel userCreation(UserRegistrationModel userRegistrationModel);

	public List<UserRegistrationModel> getAllUsers();

	public Optional<UserRegistrationModel> getUserById(Integer id);

	public UserRegistrationModel updateUser(Integer id, UserRegistrationModel userDetails);

	public void deleteUser(Integer id);
}
