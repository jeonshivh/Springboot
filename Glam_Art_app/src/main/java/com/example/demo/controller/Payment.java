package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Pay_model;

import com.example.demo.service.Pay_src;

@RestController
public class Payment {

	@Autowired
	Pay_src psr;
	
	@PostMapping("po4")
	public Pay_model pstt(@RequestBody Pay_model ps)
	{
		return psr.postfo(ps);
	}
	@GetMapping("g4") 
	public List <Pay_model> gtt(Pay_model ps)
	{
		return psr.getfo();
	}
	@DeleteMapping("d4")
	public String Dlte (@RequestBody Pay_model ps)
	{
		psr.deleteo(ps);
		return "Deletion successful";
	}
}
