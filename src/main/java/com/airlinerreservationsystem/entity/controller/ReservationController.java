package com.airlinerreservationsystem.entity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.airlinerreservationsystem.entity.Flights;
import com.airlinerreservationsystem.entity.Reservation;
import com.airlinerreservationsystem.repository.ReservationRepository;

@CrossOrigin("http://localhost:3000")
@RestController
public class ReservationController {
	
	@Autowired
	private ReservationRepository repo;
	
	@PostMapping("/reservation/add")
	Reservation newFlights(@RequestBody Reservation reservation) {
		return repo.save(reservation);
	}
	
	// get
		@GetMapping("/reservation")
		List<Reservation> getAllFlights() {
			List<Reservation> reservation = repo.findAll();
			return reservation;
		}
}
