package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Eight_mc;
import com.example.demo.repository.Eight_intf;

@Service
public class Eight_sc {

	@Autowired
	Eight_intf ei;
	public List <Eight_mc> postdeta(List <Eight_mc> em)
	{
		return (List <Eight_mc>)ei.saveAll(em);
	}
	

	public List <Eight_mc> getfull()
	{
		return ei.findAll();
	}
	public List <Eight_mc> geton(int year)
	{
		return ei.getyr(year);
	}
	
	public List <Eight_mc> getsec(int year,String bikename)
	{
		return ei.getyrbn(year,bikename);
	}
}
