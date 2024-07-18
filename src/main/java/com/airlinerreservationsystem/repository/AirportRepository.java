package com.airlinerreservationsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.airlinerreservationsystem.entity.Airports;

public interface AirportRepository extends JpaRepository<Airports, Integer> 
{

	List<Airports> findAll();

	
	
}
