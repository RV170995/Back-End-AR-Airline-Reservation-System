package com.airlinerreservationsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.airlinerreservationsystem.entity.flights;

public interface flightRepository extends JpaRepository<flights, Integer>
{
	List<flights>findAll();
}
