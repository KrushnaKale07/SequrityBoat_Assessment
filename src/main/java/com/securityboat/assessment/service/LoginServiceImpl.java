package com.securityboat.assessment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.securityboat.assessment.model.UserRegistrationModel;
import com.securityboat.assessment.repository.LoginRepository;

@Service
public class LoginServiceImpl {

	@Autowired
	LoginRepository loginRepository;

	public String userLogin(UserRegistrationModel userRegistrationModel) {

		try {
			loginRepository.getLoginDetails(userRegistrationModel.getEmailID(), userRegistrationModel.getPassword());
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}
}
