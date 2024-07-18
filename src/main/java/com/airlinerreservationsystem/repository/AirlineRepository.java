package com.airlinerreservationsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.airlinerreservationsystem.entity.Airline;

public interface AirlineRepository extends JpaRepository<Airline, Integer>
{
	List<Airline>findAll();
}
