//package com.securityboat.assessment.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.securityboat.assessment.model.UserRegistrationModel;
//import com.securityboat.assessment.service.LoginServiceImpl;
//
//@RestController
//@RequestMapping("/login")
//public class LoginController {
//	
//	@Autowired
//	LoginServiceImpl loginServiceImpl;
//	
//	@PostMapping("/userlogin")
//	public String userLogin(@RequestBody UserRegistrationModel userRegistrationModel) {
//		
//		try {
//			loginServiceImpl.userLogin(userRegistrationModel);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		return null;
//		
//	}
//	
//}
