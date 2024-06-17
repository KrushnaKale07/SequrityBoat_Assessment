package com.securityboat.assessment.service;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.securityboat.assessment.model.UserRegistrationModel;
import com.securityboat.assessment.repository.UserRegistrationRepository;

@Service
public class UserRegistrationServiceImpl implements UserRegistrationService {

	@Autowired
	UserRegistrationRepository userRegistrationRepository;

	@Override
	public UserRegistrationModel userCreation(UserRegistrationModel userRegistrationModel) {

		UserRegistrationModel result = null;
		try {
			result = userRegistrationRepository.save(userRegistrationModel);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public List<UserRegistrationModel> getAllUsers() {
		return userRegistrationRepository.findAll();
	}

	@Override
	public Optional<UserRegistrationModel> getUserById(Integer id) {
		return userRegistrationRepository.findById(id);
	}

	@Override
	public UserRegistrationModel updateUser(Integer id, UserRegistrationModel userDetails) {
		Optional<UserRegistrationModel> optionalUser = userRegistrationRepository.findById(id);
		if (optionalUser.isPresent()) {
			UserRegistrationModel userRegistrationModel = optionalUser.get();
			
			UserRegistrationModel model = new UserRegistrationModel();

			userRegistrationModel.setFirstName(userDetails.getFirstName());
			userRegistrationModel.setLastName(userDetails.getLastName());
			userRegistrationModel.setEmailID(userDetails.getEmailID());

			

			return userRegistrationRepository.save(userRegistrationModel);
			
		}
		return null;
	}

	@Override
	public void deleteUser(Integer id) {
		if (userRegistrationRepository.existsById(id)) {
			userRegistrationRepository.deleteById(id);
		} else {
			throw new IllegalArgumentException("User with ID " + id + " does not exist");
		}
	}
}
