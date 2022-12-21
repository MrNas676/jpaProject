package com.example.demo.dao;

import org.apache.catalina.User; 
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.user;



@Repository 
public interface UserRepo extends CrudRepository<user, Integer> {

	void save(User theItem);
	
//	User findByName(String name);

}
