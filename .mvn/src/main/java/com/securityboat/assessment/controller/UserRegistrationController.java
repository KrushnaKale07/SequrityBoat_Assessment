package com.securityboat.assessment.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.securityboat.assessment.model.UserRegistrationModel;
import com.securityboat.assessment.service.UserRegistrationServiceImpl;

@RestController
@RequestMapping("/register")
public class UserRegistrationController {

	@Autowired
	UserRegistrationServiceImpl userRegistrationServiceImpl;

	@PostMapping("/create")
	public UserRegistrationModel registration(@RequestBody UserRegistrationModel userRegistrationModel) {
		UserRegistrationModel result = null;
		try {
			result = userRegistrationServiceImpl.userCreation(userRegistrationModel);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@GetMapping
	public List<UserRegistrationModel> getAllUsers() {
		return userRegistrationServiceImpl.getAllUsers();
	}

	@GetMapping("/{id}")
	public Optional<UserRegistrationModel> getUserById(@PathVariable Integer id) {
		return userRegistrationServiceImpl.getUserById(id);
	}
	
	@PutMapping("/{id}")
    public UserRegistrationModel updateUserById(@PathVariable Integer id, @RequestBody UserRegistrationModel userDetails) {
        return userRegistrationServiceImpl.updateUser(id, userDetails);
    }
	
	 @DeleteMapping("/{id}")
	 public void deleteUserById(@PathVariable Integer id) {
		 userRegistrationServiceImpl.deleteUser(id);
	 }
}
