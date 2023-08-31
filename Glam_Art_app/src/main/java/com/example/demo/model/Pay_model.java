package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Pay_model {
	@Id
	private int payid;
	private String holdername;
	private String address;
	private int pincode;
	private int cost;
	public Pay_model() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pay_model(int payid, String holdername, String address, int pincode, int cost) {
		super();
		this.payid = payid;
		this.holdername = holdername;
		this.address = address;
		this.pincode = pincode;
		this.cost = cost;
	}
	public int getPayid() {
		return payid;
	}
	public void setPayid(int payid) {
		this.payid = payid;
	}
	public String getHoldername() {
		return holdername;
	}
	public void setHoldername(String holdername) {
		this.holdername = holdername;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	

}
