package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Pojo_cls;
import com.example.demo.service.Service_cls;

@RestController
public class Cont_cls {
	@Autowired
	Service_cls s;
	@PostMapping("post")
	public Pojo_cls postv(@RequestBody Pojo_cls pj)
	{
		return s.saveinfo(pj);
	}
	@GetMapping("get")
	public List <Pojo_cls> readv(Pojo_cls pj)
	{
		return s.showinfo(pj);
	}
	@PutMapping("put")
	public Pojo_cls putv(@RequestBody Pojo_cls pj)
	{
		return s.update(pj);
	}
	@DeleteMapping("del")
	public String delv(@RequestBody Pojo_cls pj)
	{
		s.delete(pj);
		return "Deleted";
	}
}
