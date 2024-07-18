package com.airlinerreservationsystem.entity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.airlinerreservationsystem.entity.Airline;

import com.airlinerreservationsystem.repository.AirlineRepository;

import exception.UserNotFoundException;




@CrossOrigin("http://localhost:3000")
@RestController
public class AirlineController {
	
	@Autowired
	AirlineRepository repo;
	
	@PostMapping("/airlines/add")
	Airline newAirlines(@RequestBody Airline air) {
		return repo.save(air);
	}

	// get
	@GetMapping("/airlines")
	List<Airline> getAllFlights() {
		List<Airline> air = repo.findAll();
		return air;
	}

	// update
	@PutMapping("/airlines/update/{a_id}")
	public Airline updateAirport(@RequestBody Airline port, @PathVariable int a_id)
	{
		Airline air=repo.findById(a_id).get();
		air.setA_id(port.getA_id());
		air.setA_name(port.getA_name());
		air.setRegion(port.getRegion());
		air.setContact(port.getContact());

		System.out.println(air);
		
		repo.save(air);
		return air;
		
	}	
	@DeleteMapping("/airlines/delete/{a_id}")
    String deleteUser(@PathVariable int a_id){
        if(!repo.existsById(a_id )){
            throw new UserNotFoundException(a_id);
        }
       repo.deleteById(a_id);
        return  "User with id "+a_id+" has been deleted success.";
    }
}
