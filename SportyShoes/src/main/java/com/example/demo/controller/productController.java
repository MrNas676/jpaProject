package com.example.demo.controller;

import java.util.Optional;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entities.product;
import com.example.demo.entities.user;
import com.example.demo.services.ProductService;
import com.example.demo.services.UserService;

public class productController {

	@Autowired
	ProductService service;
	
	@GetMapping("/products")
	Iterable<product> getAllUsers() {
		return service.getAllProducts();
	}
	
	@GetMapping("/products/{id}")
	Optional<product> getUserById(@PathVariable int ProductId){
		return service.getProductById(ProductId);
	}
	
//	@PostMapping("/products")
//	public void addNewUser(@RequestBody Product theProduct) {
//		service.addNewItem(theProduct);
//	}
	
	@PutMapping("/products/{id}")
	public void updateProduct(@RequestBody product theProduct) {
		service.updateProduct(theProduct);
	}
	
//	@GetMapping("/users/names")
//	public User getUserByName(@RequestParam String name) {
//		return service.getUserByName(name);
//	}
}