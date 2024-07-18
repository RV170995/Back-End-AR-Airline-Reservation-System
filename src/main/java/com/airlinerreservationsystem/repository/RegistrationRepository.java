package com.airlinerreservationsystem.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.airlinerreservationsystem.entity.Registrations;

public interface RegistrationRepository extends JpaRepository<Registrations, Integer> 
{
	List<Registrations> findAll();

	Optional<Registrations> findByEmailID(String emailID);
	
	Registrations findByPswd(String pswd);

}
