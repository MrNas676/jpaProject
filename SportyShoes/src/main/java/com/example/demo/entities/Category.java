package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Category {

	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer Categoryid;
	private String BrandName;
	
	 
	public Category(int Categoryid, String BrandName) {
		super();
		this.Categoryid = Categoryid;
		this.BrandName = BrandName;
	}


	private String name;
	
	Category(){
		
	}


	@Override
	public String toString() {
		return "Category [Categoryid=" + Categoryid + ", BrandName=" + BrandName + "]";
	}


	public int getId() {
		return Categoryid;
	}


	public void setId(int Categoryid) {
		this.Categoryid = Categoryid;
	}


	public String getName() {
		return BrandName;
	}


	public void setName(String name) {
		this.name = name;
	}

}
