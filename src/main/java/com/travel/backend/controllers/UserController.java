package com.travel.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.travel.backend.entities.traveller.Traveller;
import com.travel.backend.entities.user.User;
import com.travel.backend.repositories.UserRepository;
import com.travel.backend.service.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class UserController {
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private UserService userService;

	@GetMapping("/users")
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	@GetMapping("/delete/{id}")
	public boolean deleteUser(@PathVariable Long id) {
		return userService.deleteUser(id);
	}
	
	@GetMapping("/user/{id}")
	public User user(@PathVariable Long id) {
		return userService.getUser(id);
	}

	@PostMapping("/create-user")
	public User createUser(@RequestBody User user) {
		user.setRole("Traveller");
		return userRepository.save(user);
	}

	@PutMapping("/update-user")
	public User updateUser(@RequestBody Traveller user) {

		return userService.updateUser(user);
	}

	@GetMapping("/login/{email}/{password}")
	public User login(@PathVariable String email, @PathVariable String password) {
		return userService.login(email, password);
	}
}
