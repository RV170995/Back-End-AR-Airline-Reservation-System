package com.airlinerreservationsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.airlinerreservationsystem.entity.airports;

public interface airportRepository extends JpaRepository<airports, Integer> 
{

	List<airports> findAll();

	
	
}
