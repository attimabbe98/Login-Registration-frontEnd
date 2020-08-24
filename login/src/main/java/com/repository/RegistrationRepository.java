package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.User;

public interface RegistrationRepository extends JpaRepository<User,Integer> 
{

	User findByEmailId(String emailId);

	User findByEmailIdAndPassword(String emailId, String password);

}
