package com.airlinerreservationsystem.entity.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.airlinerreservationsystem.entity.flights;
import com.airlinerreservationsystem.repository.flightRepository;

import exception.UserNotFoundException;

@CrossOrigin("http://localhost:3000")
@RestController
public class flightsController {

	@Autowired
	flightRepository repo;

	@PostMapping("/flights/add")
	flights newFlights(@RequestBody flights flight) {
		return repo.save(flight);
	}

	// get
	@GetMapping("/flights")
	List<flights> getAllFlights() {
		List<flights> flight = repo.findAll();
		return flight;
	}

	// update
	@GetMapping("flights/{f_id}")
	flights getFlights(@PathVariable int f_id) {
		flights flight = repo.findById(f_id).get();
		return flight;
	}

//	@GetMapping("/flights/search")
//	List<flights> getFilteredFlights(@RequestParam String origin, @RequestParam String destination,
//			@RequestParam String date) {
//		return repo.findAll().stream().filter(f -> f.getOrigin().equalsIgnoreCase(origin))
//				.filter(f -> f.getDestination().equalsIgnoreCase(destination)).filter(f -> f.getDate().equals(date))
//				.collect(Collectors.toList());
//	}

	@GetMapping("/flights/search")
	List<flights> getFilteredFlights(@RequestParam String origin, @RequestParam String destination) {
		System.out.println(origin + "_______" + destination + "_______" );
		return repo.findAll().stream().filter(f -> f.getOrigin().equalsIgnoreCase(origin))
				.filter(f -> f.getDestination().equalsIgnoreCase(destination)).collect(Collectors.toList());
	}

	@GetMapping("/flights/cities")
	List<String> getCities() {
		List<flights> allFlights = repo.findAll();
		Set<String> cities = new HashSet<>();

		for (flights flight : allFlights) {
			cities.add(flight.getOrigin());
			cities.add(flight.getDestination());
		}

		return new ArrayList<>(cities);
	}
	
	@DeleteMapping("/flights/delete/{f_id}")
    String deleteUser(@PathVariable int f_id){
        if(!repo.existsById(f_id )){
            throw new UserNotFoundException(f_id);
        }
       repo.deleteById(f_id);
        return  "User with id "+f_id+" has been deleted success.";
    }

}
