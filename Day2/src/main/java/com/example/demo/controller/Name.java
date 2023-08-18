package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Name {
	@Value("${var}")
	private String name;
	@GetMapping("g")
	public String getName()
	{
		return name;
	}

}
