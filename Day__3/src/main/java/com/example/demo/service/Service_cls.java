package com.example.demo.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Pojo_cls;
import com.example.demo.repository.Rep_intf;

@Service
public class Service_cls {
	@Autowired
	Rep_intf r;
	public Pojo_cls saveinfo(Pojo_cls pj) 
	{
		return r.save(pj);
	}
	public List <Pojo_cls> showinfo()
	{
		return r.findAll();
	}
	

}
