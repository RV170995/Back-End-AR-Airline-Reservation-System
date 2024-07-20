package com.airlinerreservationsystem.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.airlinerreservationsystem.entity.Reservations;

public interface ReservationRepository extends JpaRepository<Reservations, Integer>{
	List<Reservations>findAll();
}
