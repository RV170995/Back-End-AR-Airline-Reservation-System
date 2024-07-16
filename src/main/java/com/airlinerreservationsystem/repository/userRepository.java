package com.airlinerreservationsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.airlinerreservationsystem.entity.user;

public interface userRepository extends JpaRepository<user, Integer>
{
	List<user>findAll();
}
