package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ProductRepo;
import com.example.demo.dao.PurchaseRepo;
import com.example.demo.entities.product;
import com.example.demo.entities.purchase;

@Service
public class PurchaseService {
	
	@Autowired
	PurchaseRepo repo;
	
	public Iterable<purchase> getAllPurchases() {
		return repo.findAll();
	}

	public java.util.Optional<purchase> getPurchaseById(Integer PurchaseId) {
		return repo.findById(PurchaseId);
	}
	
//	public void updateProduct(product theProduct) {
//		repo.save(theProduct);
//	}
	
//	public User getUserByName(String name) {
//		return repo.findByName(name);
//	}

}