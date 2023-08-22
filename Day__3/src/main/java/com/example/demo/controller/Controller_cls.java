package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Pojo_cls;
import com.example.demo.service.Service_cls;

@RestController
public class Controller_cls {
	@Autowired
	Service_cls ss;
	@PostMapping("addemp")
	public Pojo_cls add(@RequestBody Pojo_cls pj)
	{
		return ss.saveinfo(pj);
	}
	@GetMapping("showdet")
	public List <Pojo_cls> show()
	{
		return ss.showinfo();
	}

}
