package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.Entity_cls;
import com.example.demo.repository.Six_Rep_intf;

@Service
public class Service_cls {
	@Autowired
	Six_Rep_intf srf;
	
	public Entity_cls post(Entity_cls ec)
	{
		return srf.save(ec);
	}
     
	public List <Entity_cls> gett(Entity_cls ec)
	{
		return srf.findAll();
	}

	public Entity_cls put(Entity_cls ec)
	{
		return srf.saveAndFlush(ec);
	}

	public void delete(Entity_cls ec)
	{
		 srf.delete(ec);
	}

	public List <Entity_cls> sort(String d)
	{
		return srf.findAll(Sort.by(Sort.DEFAULT_DIRECTION,d));
	}

	
}
