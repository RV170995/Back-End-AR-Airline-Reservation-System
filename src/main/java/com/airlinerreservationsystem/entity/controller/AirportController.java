package com.airlinerreservationsystem.entity.controller;

import java.util.*;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.airlinerreservationsystem.entity.Airports;
import com.airlinerreservationsystem.repository.AirportRepository;

import exception.UserNotFoundException;


@CrossOrigin("http://localhost:3000")
@RestController
public class AirportController {
	
	@Autowired
	AirportRepository repo;
	
	
	@PostMapping("/airports/add")
	Airports newAirport(@RequestBody Airports airport)
	{
		return repo.save(airport);
	}
	//get
	@GetMapping("/airports")
	List<Airports> getAllAirports()
	{
		List<Airports>Airports = repo.findAll();
		return Airports;
	}
	//update
	@GetMapping("airports/{airport_code}")
	Airports getAirport(@PathVariable int airport_code)
	{
		Airports airport = repo.findById(airport_code).get();
		return airport;	
	}
	
	
	
	//
	@PutMapping("airports/update/{airport_code}")
	public Airports updateAirport(@PathVariable int airport_code)
	{
		Airports airport =repo.findById(airport_code).get();
		airport.setAirport_name("Pune Airport");
		airport.setLocation("Pune");
		
		repo.save(airport);
		return airport;
		
	}
	
	@DeleteMapping("/airports/delete/{airport_code}")
    String deleteUser(@PathVariable int airport_code){
        if(!repo.existsById(airport_code )){
            throw new UserNotFoundException(airport_code);
        }
       repo.deleteById(airport_code);
        return  "User with id "+airport_code+" has been deleted success.";
    }
	
//	@DeleteMapping("airports/delete/{airport_code}")
//	public void removeAirport(@PathVariable int airport_code)
//	{
//		airports airport = repo.findById(airport_code).get();
//		repo.delete(airport);
//	}
	
	 
			
}

