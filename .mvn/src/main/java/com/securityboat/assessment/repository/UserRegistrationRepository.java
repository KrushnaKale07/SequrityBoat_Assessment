package com.securityboat.assessment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.securityboat.assessment.model.UserRegistrationModel;

@Repository
public interface UserRegistrationRepository extends JpaRepository<UserRegistrationModel, Integer>{

//	@Modifying
//	@Query("update users_account set first_name = ?1, emailid = ?2 where userid = ?3")
//	UserRegistrationModel updateUserInfo(String first_name, String emailid, Integer id );
	
}
