package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Ord_pojo {
	@Id
	private int id;
	private int ord_date;
	private String ord_item;
	private int quantity;
	private long price;
	public Ord_pojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ord_pojo(int id, int ord_date, String ord_item, int quantity, long price) {
		super();
		this.id = id;
		this.ord_date = ord_date;
		this.ord_item = ord_item;
		this.quantity = quantity;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getOrd_date() {
		return ord_date;
	}
	public void setOrd_date(int ord_date) {
		this.ord_date = ord_date;
	}
	public String getOrd_item() {
		return ord_item;
	}
	public void setOrd_item(String ord_item) {
		this.ord_item = ord_item;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	
 
}
