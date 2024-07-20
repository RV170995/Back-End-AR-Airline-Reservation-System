package com.airlinerreservationsystem.entity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.airlinerreservationsystem.entity.Reservations;
import com.airlinerreservationsystem.repository.ReservationRepository;

import exception.UserNotFoundException;

@CrossOrigin("http://localhost:3000")
@RestController
public class ReservationController {
	
	@Autowired
	private ReservationRepository repo;
	
	@PostMapping("/reservation/add")
	Reservations newFlights(@RequestBody Reservations reservation) {
		return repo.save(reservation);
	}
	
	@GetMapping("/reservation")
	List<Reservations> getAllAirports()
	{
		List<Reservations>reserve = repo.findAll();
		return reserve;
	}
	
	@DeleteMapping("/reservations/delete/{reserv_id}")
    String deleteUser(@PathVariable int reserv_id){
        if(!repo.existsById(reserv_id )){
            throw new UserNotFoundException(reserv_id);
        }
       repo.deleteById(reserv_id);
        return  "User with id "+reserv_id+" has been deleted success.";
    }
}
