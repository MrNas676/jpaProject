package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class purchase {

	@Id
	private Integer PurchasetId;
	
	private Integer quantity;
	
	
	//Foriegn to Primary Key relationship
	@ManyToOne
	private Integer productId; 
	
	@ManyToOne
	private Integer receiptId;

	private product product;

	private purchase purchase;

	private Category category;

	private Integer PurchaseId;

	private receipt receipt;
	
	
	
	public purchase getProduct() {
		return purchase;
	}

	public void setProduct(product product) {
		this.product = product;
	}
	
	public purchase getReceipt() {
		return purchase;
	}

	public void setReceipt(receipt receipt) {
		this.receiptId = receiptId;
	}

	purchase(){
		
	}

	public void Product(Integer PurchasetId, Integer quantity, Integer productId, Integer receiptId) {
		this.PurchasetId = PurchasetId;
		this.quantity = quantity;
		this.productId = productId;
		this.receiptId = receiptId;

		
		this.product = new product();
		this.receipt = new receipt();


	}

	public Integer getProductId() {
		return PurchaseId;
	}

	public void setProductId(Integer PurchaseId) {
		this.PurchaseId = PurchaseId;
	}

//	public String getProductName() {
//		return PName;
//	}

//	public void setProductName(String PName) {
//		this.PName = PName;
//	}

//	public String getPrice() {
//		return price;
//	}

//	public void setPrice(String price) {
//		this.price = price;
//	}

	@Override
	public String toString() {
		return "Purchase [PurchaseId=" + PurchaseId + ", quantity=" + quantity + "]";
	}
	
	
	
	
	
	
	
}