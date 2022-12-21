package com.example.demo.dao;

import org.apache.catalina.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.product;
import com.example.demo.entities.user;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;

@Repository 
public interface ProductRepo extends CrudRepository<product, Integer> {

	
//	 void save(product theProduct);
	
//	User findByName(String name);

}
