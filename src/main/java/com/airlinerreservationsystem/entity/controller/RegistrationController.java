package com.airlinerreservationsystem.entity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.airlinerreservationsystem.entity.registrations;
import com.airlinerreservationsystem.repository.registrationRepository;



@CrossOrigin("http://localhost:3000")
@RestController
public class RegistrationController {
	
	@Autowired
	private registrationRepository repo;
	

//	@Autowired
//	private PasswordEncoder passwordEncoder;
	
	@PostMapping("/registration/add")
	registrations newRegistration(@RequestBody registrations registration)
	{
//		registration.setPswd(passwordEncoder.encode(registration.getPswd()));
		System.out.println(registration);
		return repo.save(registration);
	}
	
	@GetMapping("/registration")
	List<registrations> getAllRegistration()
	{
		List<registrations>u = repo.findAll();
		return u;
	}
	@GetMapping("registration/{reg_id}")
	registrations getRegistration(@PathVariable int reg_id)
	{
		registrations registration = repo.findById(reg_id).get();
		return registration;	
	}
	
	
	@GetMapping("registration/pswd/{pswd}")
	registrations getRegistrationByPswd(@PathVariable String pswd)
	{
		registrations registration = repo.findByPswd(pswd);
		return registration;	
	}
	
			

}

