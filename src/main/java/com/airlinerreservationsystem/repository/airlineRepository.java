package com.airlinerreservationsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.airlinerreservationsystem.entity.airline;

public interface airlineRepository extends JpaRepository<airline, Integer>
{
	List<airline>findAll();
}
