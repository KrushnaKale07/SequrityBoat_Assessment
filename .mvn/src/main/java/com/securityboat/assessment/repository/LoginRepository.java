//package com.securityboat.assessment.repository;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;
//
//import com.securityboat.assessment.model.UserRegistrationModel;
//
//@Repository
//public interface LoginRepository extends JpaRepository<UserRegistrationModel, Integer> {
//	
//	public String userLogin(UserRegistrationModel userRegistrationModel);
//
//	@Query("SELECT emailid, password FROM UserRegistrationModel  WHERE userid = userid;")
//	public UserRegistrationModel getLoginDetails(@Param("emailid") String emailid,
//			@Param("password") String password);
//}
//
////	@Query("Select emailid and password from  users_account where userid = ?1")
////	public UserRegistrationModel getLoginDetails(String emailID, String password);
////	
////}
