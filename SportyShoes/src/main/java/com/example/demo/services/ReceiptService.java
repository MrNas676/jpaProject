package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ProductRepo;
import com.example.demo.dao.ReceiptRepo;
import com.example.demo.entities.product;
import com.example.demo.entities.receipt;

@Service
public class ReceiptService {
	
	@Autowired
	ReceiptRepo repo;
	
	public Iterable<receipt> getAllReceipts() {
		return repo.findAll();
	}

	public java.util.Optional<receipt> getReceiptsById(Integer receiptsId) {
		return repo.findById(receiptsId);
	}
	
	public void updateReceipts(receipt theReceipts) {
		repo.save(theReceipts);
	}
	
//	public User getUserByName(String name) {
//		return repo.findByName(name);
//	}

}