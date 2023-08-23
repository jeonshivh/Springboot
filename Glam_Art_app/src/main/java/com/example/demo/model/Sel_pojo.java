package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Sel_pojo {
	@Id
	private int id;
	private String gender;
	private int age;
	private String item;
	public Sel_pojo(int id, String gender, int age, String item) {
		super();
		this.id = id;
		this.gender = gender;
		this.age = age;
		this.item = item;
	}
	public Sel_pojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	
	
 
}
