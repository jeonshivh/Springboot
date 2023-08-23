package com.example.demo.controller;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.model.User_pojo;
import com.example.demo.service.User_sc;
@RestController
public class User {
	
	
		@Autowired
		User_sc us;
		
		@PostMapping("po1")
		public User_pojo Postf( @RequestBody User_pojo up)
		{
			return us.postf(up);
		}
		
		@GetMapping("g1")
		public List <User_pojo>  Getf(User_pojo up)
		{
			return us.getf(up);
		}
		
		@PutMapping("p1") 
		public User_pojo Putf(@RequestBody User_pojo up)
		{
			return us.putf(up);
		}
		
		@DeleteMapping("d1")
		public String Delete (@RequestBody User_pojo up)
		{
			us.delete(up);
			return "Deletion successful";
		}

		
	}


