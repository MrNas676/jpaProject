package com.example.demo.controller;

import java.util.Optional;

import org.apache.catalina.User;  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.user;
import com.example.demo.services.UserService;




@RestController
public class TController {
	
	@Autowired
	UserService service;
	
	@GetMapping("/users")
	Iterable<user> getAllUsers() {
		return service.getAllUsers();
	}
	
	@GetMapping("/users/{id}")
	Optional<user> getUserById(@PathVariable int id){
		return service.getUserById(id);
	}
	
	@PostMapping("/users")
	public void addNewUser(@RequestBody User theUser) {
		service.addNewItem(theUser);
	}
	
	@PutMapping("/users/{id}")
	public void updateUser(@RequestBody User theUser) {
		service.updateItem(theUser);
	}
	
//	@GetMapping("/users/names")
//	public User getUserByName(@RequestParam String name) {
//		return service.getUserByName(name);
//	}
}