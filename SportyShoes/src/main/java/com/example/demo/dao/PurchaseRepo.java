package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.purchase;

@Repository 
public interface PurchaseRepo extends CrudRepository<purchase, Integer> {

}