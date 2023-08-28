package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Sev_model;
import com.example.demo.repository.Seven_intf;

@Service
public class Seven_sercls {
	@Autowired
	Seven_intf sf;
	
	public List <Sev_model> post(List <Sev_model> sm)
	{
		return (List<Sev_model>)sf.saveAll(sm);
	}
	public List <Sev_model> getok(List <Sev_model> sm)
	{
		return (List<Sev_model>)sf.findAll();
	}
	public List <Sev_model> geto(int owners)
	{
		return sf.getodet(owners);
	}
	public List <Sev_model> geta(String address)
	{
		return sf.getadet(address);
	}
	public List <Sev_model> getc(String carName)
	{
		return sf.getcdet(carName);
	}
	public List <Sev_model> getoc(int owners,String carType)
	{
		return sf.getocdet(owners,carType);
	}

}
