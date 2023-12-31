package com.example.demo.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User_pojo;
import com.example.demo.repository.User_intf;
@Service
public class User_sc {
	@Autowired
	User_intf ui;
	
	
	public User_pojo postf(User_pojo up)
	{
		return ui.save(up);
	}
	
	public List <User_pojo>  getf(User_pojo up)
	{
		return ui.findAll();
	}
	
	public List <User_pojo> sele(int userid)
	{
		return ui.getid(userid);
	}
	
	
	public Integer  upe(int userid,int newid)
	{
		return ui.uid(userid,newid);
	}
	
	public void delete (User_pojo up)
	{
		ui.delete(up);
		
	}
	public Integer  delt(int userid)
	{
		return ui.deid(userid);
	}
	

	
}
