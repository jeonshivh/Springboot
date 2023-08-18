package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Second {
	@Value("${var}")
	private String studentname;
	@GetMapping("/")
	public String getName()
	{
		return "Welcome "+studentname+" !";
	}

}
