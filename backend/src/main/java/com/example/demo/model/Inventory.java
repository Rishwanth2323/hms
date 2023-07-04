package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Inventory {
	@Id
	@GeneratedValue
    private Long id;
    private String name;
    private Long quantity;
    private String category;
    private Long price;
    private String supplier;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	public String getSupplier() {
		return supplier;
	}
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
	
	public Inventory(Long id, String name, Long quantity, String category, Long price, String supplier) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.category = category;
		this.price = price;
		this.supplier = supplier;
	}
	public Inventory() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getQuantity() {
		return quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
	

    
}
