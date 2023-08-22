package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity 
public class Pojo_cls {
	@Id
	private int id;
	private String employee_name;
	private long salary;
    private int employee_Age;
	public Pojo_cls(int id, String employee_name, long salary, int employee_Age) {
		super();
		this.id = id;
		this.employee_name = employee_name;
		this.salary = salary;
		this.employee_Age = employee_Age;
	}
	public Pojo_cls() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmployee_name() {
		return employee_name;
	}
	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public int getEmployee_Age() {
		return employee_Age;
	}
	public void setEmployee_Age(int employee_Age) {
		this.employee_Age = employee_Age;
	}
    
}
