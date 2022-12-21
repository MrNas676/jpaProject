package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ProductRepo;
import com.example.demo.entities.product;

@Service
public class ProductService {
	
	@Autowired
	ProductRepo repo;
	
	public Iterable<product> getAllProducts() {
		return repo.findAll();
	}

	public java.util.Optional<product> getProductById(Integer ProductId) {
		return repo.findById(ProductId);
	}
	
	public void updateProduct(product theProduct) {
		repo.save(theProduct);
	}
	
//	public User getUserByName(String name) {
//		return repo.findByName(name);
//	}

}