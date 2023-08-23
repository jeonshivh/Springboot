package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Ord_pojo;
import com.example.demo.repository.Ord_intf;
@Service
public class Ord_sc {

	@Autowired
	Ord_intf oi;
	
	public Ord_pojo postt(Ord_pojo op)
	{
		return oi.save(op);
	}
	public List <Ord_pojo> gett(Ord_pojo op)
	{
		return oi.findAll();
	}
	public Optional <Ord_pojo> gettn(int id)
	{
		return oi.findById(id);
	}
	public Ord_pojo putt(Ord_pojo op)
	{
		return oi.saveAndFlush(op);
	}
	//UpdateById
	public String uid(int id,Ord_pojo op)
	{
		oi.saveAndFlush(op);
		if(oi.existsById(id))
		{
			return "Updated";
		}
		else
		{
			return "enter valid id";
		}
	}
	public void delt(Ord_pojo op)
	{
		oi.delete(op);
	}
	//DeleteByid
	public void deltn(int id)
	{
		oi.deleteById(id);
	}
}
