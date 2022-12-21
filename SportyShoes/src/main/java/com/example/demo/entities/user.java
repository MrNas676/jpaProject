package com.example.demo.entities;


import jakarta.persistence.Entity; 
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity 
public class user {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	 
	public user(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	private String name;
	
	user(){
		
	}


	@Override
	public String toString() {
		return "user [id=" + id + ", name=" + name + "]";
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

}
