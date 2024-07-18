package com.airlinerreservationsystem.entity.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.airlinerreservationsystem.entity.Registrations;
import com.airlinerreservationsystem.entity.User;
import com.airlinerreservationsystem.repository.UserRepository;

import exception.UserNotFoundException;



@CrossOrigin("http://localhost:3000")
@RestController
public class UserController {
	
	
	
	@Autowired
	UserRepository repo;
	
	
	@PostMapping("/user/add")
	User newUser(@RequestBody User u)
	{
		return repo.save(u);
	}
	
	@GetMapping("/user")
	List<User> getAllUser()
	{
		List<User>u = repo.findAll();
		return u;
	}
	@GetMapping("user/{u_id}")
	User getUser(@PathVariable int u_id)
	{
		User registration = repo.findById(u_id).get();
		return registration;	
	}
	
	
	@DeleteMapping("/users/delete/{u_id}")
    String deleteUser(@PathVariable int u_id){
        if(!repo.existsById(u_id)){
            throw new UserNotFoundException(u_id);
        }
       repo.deleteById(u_id);
        return  "User with id "+u_id+" has been deleted success.";
    }
	
	
//	
//	 @PostMapping("/login")
//	    public ResponseEntity<?> loginUser(@RequestBody User user) {
//	        Optional<User> optionalUser = repo.findByEmailID(user.getEmailID());
//	        if (optionalUser.isPresent()) {
//	            User dbUser = optionalUser.get();
//	            if (dbUser.getPswd().equals(user.getPswd())) {
//	                return ResponseEntity.ok(dbUser);
//	            }
//	        }
//	        return ResponseEntity.status(401).body("Invalid email or password");
//	    }

}
