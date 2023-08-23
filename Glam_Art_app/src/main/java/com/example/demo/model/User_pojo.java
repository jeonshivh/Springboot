package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User_pojo {
	@Id
	private int id;
	private long phone_number;
	private int age;
	private String name;
	public User_pojo(int id, long phone_number, int age, String name) {
		super();
		this.id = id;
		this.phone_number = phone_number;
		this.age = age;
		this.name = name;
	}
	public User_pojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(long phone_number) {
		this.phone_number = phone_number;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}

