package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Third {
	@Value("${co}")
	private String color;
	@GetMapping("d")
	public String getMyFav()
	{
		return"My favourite color is "+color;
	}
	

}
