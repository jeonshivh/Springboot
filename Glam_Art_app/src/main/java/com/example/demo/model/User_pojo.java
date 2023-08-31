package com.example.demo.model;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@Table(name="Selection_category")
@Entity
public class User_pojo {
	@Id
	private int userid;
	private long phone_number;
	private int age;
	private String name;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="user_id")
	private List<Ord_pojo> ord;
	public User_pojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User_pojo(int userid, long phone_number, int age, String name, List<Ord_pojo> ord) {
		super();
		this.userid = userid;
		this.phone_number = phone_number;
		this.age = age;
		this.name = name;
		this.ord = ord;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
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
	public List<Ord_pojo> getOrd() {
		return ord;
	}
	public void setOrd(List<Ord_pojo> ord) {
		this.ord = ord;
	}
	
		
}

