package com.example.demo.services;

import java.util.List; 

import org.apache.catalina.User;
import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserRepo;
import com.example.demo.entities.user;


@Service
public class UserService {
	
	@Autowired
	UserRepo repo;
	
	public Iterable<user> getAllUsers() {
		return repo.findAll();
	}

	public java.util.Optional<user> getUserById(Integer id) {
		return repo.findById(id);
	}
	
	public void addNewItem(User theItem) {
		repo.save(theItem);
	}
	
	public void updateItem(User theItem) {
		repo.save(theItem);
	}
	
//	public User getUserByName(String name) {
//		return repo.findByName(name);
//	}

}
