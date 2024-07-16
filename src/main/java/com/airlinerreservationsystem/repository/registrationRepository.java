package com.airlinerreservationsystem.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.airlinerreservationsystem.entity.registrations;

public interface registrationRepository extends JpaRepository<registrations, Integer> 
{
	List<registrations> findAll();

	Optional<registrations> findByEmailID(String emailID);
	
	registrations findByPswd(String pswd);

}
