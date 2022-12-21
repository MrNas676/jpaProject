package com.example.demo.entities;

import org.apache.catalina.User;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class product {

	@Id
	private Integer ProductId;
	
	private String PName;
	
	private String price;
	
	//Foriegn to Primary Key relationship
	@ManyToOne
	private Category category; 
	
	
	
	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	product(){
		
	}

	public void Product(Integer ProductId, String PName, String price, Integer categoryId) {
		this.ProductId = ProductId;
		this.PName = PName;
		this.price = price;
		
		this.category = new Category();
	}

	public Integer getPlaceId() {
		return ProductId;
	}

	public void setPlaceId(Integer ProductId) {
		this.ProductId = ProductId;
	}

	public String getProductName() {
		return PName;
	}

	public void setProductName(String PName) {
		this.PName = PName;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [ProductId=" + ProductId + ", PName=" + PName + ", price=" + price + "]";
	}
	
	
	
	
	
	
	
}