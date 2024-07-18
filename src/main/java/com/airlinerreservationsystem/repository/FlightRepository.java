package com.airlinerreservationsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.airlinerreservationsystem.entity.Flights;

public interface FlightRepository extends JpaRepository<Flights, Integer>
{
	List<Flights>findAll();
}
