package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Sel_pojo;
import com.example.demo.repository.Sel_intf;

@Service
public class Sel_sc {
	@Autowired
	Sel_intf si;
	public List <Sel_pojo> posts(List <Sel_pojo> sp)
	{
		return (List<Sel_pojo>)si.saveAll(sp);
	}
	public List <Sel_pojo> getts(Sel_pojo sp)
	{
		return si.findAll();
	}
	public Sel_pojo puts(Sel_pojo sp)
	{
		return si.saveAndFlush(sp);
	}
	public void dels(Sel_pojo sp)
	{
		 si.delete(sp);
	}
	

}
