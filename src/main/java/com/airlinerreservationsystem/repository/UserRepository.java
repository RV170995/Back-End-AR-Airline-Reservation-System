package com.airlinerreservationsystem.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import com.airlinerreservationsystem.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>
{
	List<User>findAll();
	
//Optional<User> findByEmailID(String emailID);
//	
//	User findByPswd(String pswd);

	
}
