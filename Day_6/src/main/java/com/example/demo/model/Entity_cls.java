package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Entity_cls {
	@Id
  private int babyId;
	private String babyFirstName;
	private String  babyLastname;
	private String fatherName;
	private String motherName;
	private String address;
	public Entity_cls() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Entity_cls(int babyId, String babyFirstName, String babyLastname, String fatherName, String motherName,
			String address) {
		super();
		this.babyId = babyId;
		this.babyFirstName = babyFirstName;
		this.babyLastname = babyLastname;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.address = address;
	}
	public int getBabyId() {
		return babyId;
	}
	public void setBabyId(int babyId) {
		this.babyId = babyId;
	}
	public String getBabyFirstName() {
		return babyFirstName;
	}
	public void setBabyFirstName(String babyFirstName) {
		this.babyFirstName = babyFirstName;
	}
	public String getBabyLastname() {
		return babyLastname;
	}
	public void setBabyLastname(String babyLastname) {
		this.babyLastname = babyLastname;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
