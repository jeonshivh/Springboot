package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class First {
	@GetMapping("/welcome")
public String Welcome()
{
	return"Welcome String Boot!";
}
}
