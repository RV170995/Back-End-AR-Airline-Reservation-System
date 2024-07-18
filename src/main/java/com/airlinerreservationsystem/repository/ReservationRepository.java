package com.airlinerreservationsystem.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.airlinerreservationsystem.entity.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Integer>{
	List<Reservation>findAll();
}
