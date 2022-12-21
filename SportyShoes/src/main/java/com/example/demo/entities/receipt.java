package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class receipt {

	@Id
	private Integer receiptId;
	
	private String Date;
		
	//Foriegn to Primary Key relationship
	@ManyToOne
	private user User; 
	
	
	
	public user getUser() {
		return User;
	}

	public void setUser(user User) {
		this.User = User;
	}

	receipt(){
		
	}

	public void Product(Integer receiptId, String Date, Integer UserId) {
		this.receiptId = receiptId;
		this.Date = Date;
		
		this.User = new user(UserId, "");
	}

	public Integer getUserId() {
		return receiptId;
	}

	public void setPlaceId(Integer receiptId) {
		this.receiptId = receiptId;
	}

	public String getReceiptName() {
		return Date;
	}

	public void setReceiptDate(String Date) {
		this.Date = Date;
	}


	@Override
	public String toString() {
		return "Product [receiptId=" + receiptId + ", Date=" + Date + "]";
	}
	
	
	
	
	
	
	
}