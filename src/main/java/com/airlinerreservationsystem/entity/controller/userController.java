package com.airlinerreservationsystem.entity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.airlinerreservationsystem.entity.user;
import com.airlinerreservationsystem.repository.userRepository;



@CrossOrigin("http://localhost:3000")
@RestController
public class userController {
	
	
	
	@Autowired
	userRepository repo;
	
	
	@PostMapping("/user/add")
	user newUser(@RequestBody user u)
	{
		return repo.save(u);
	}
	
	@GetMapping("/user")
	List<user> getAllUser()
	{
		List<user>u = repo.findAll();
		return u;
	}
	@GetMapping("user/{u_id}")
	user getUser(@PathVariable int u_id)
	{
		user registration = repo.findById(u_id).get();
		return registration;	
	}

}
