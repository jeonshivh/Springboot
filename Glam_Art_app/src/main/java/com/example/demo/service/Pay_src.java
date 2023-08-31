package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Pay_model;

import com.example.demo.repository.Pay_rep;

@Service
public class Pay_src {
	@Autowired
	Pay_rep pr;
	public Pay_model  postfo(Pay_model pm)
	{
		return pr.save(pm);
	}
	
	public List <Pay_model >  getfo()
	{
		return pr.findAll();
	}
	public void deleteo (Pay_model pm)
	{
		pr.delete(pm);
		
	}

}
