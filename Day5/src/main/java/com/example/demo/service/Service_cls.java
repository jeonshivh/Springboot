package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Pojo_cls;
import com.example.demo.repository.Rep_int;

@Service
public class Service_cls {
	@Autowired
	Rep_int r;
	public Pojo_cls saveinfo(Pojo_cls pj)
	{
		return r.save(pj);
	}
	public List <Pojo_cls> showinfo(Pojo_cls pj)
	{
		return r.findAll();
	}
    public Pojo_cls update(Pojo_cls pj)
    {
    	return r.saveAndFlush(pj);
    }
    public void delete(Pojo_cls pj)
    {
    	r.delete(pj);
    }
    
}
