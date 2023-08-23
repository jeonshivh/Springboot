package com.example.demo.controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import com.example.demo.model.Sel_pojo;
import com.example.demo.service.Sel_sc;
@RestController
public class Selection {
 @Autowired
	Sel_sc ss;
 
	@PostMapping("po2")
	public  List <Sel_pojo> posts(@RequestBody List<Sel_pojo> sp)
	{
		return (List<Sel_pojo>)ss.posts(sp);
	}
	@GetMapping("g2")
	public List <Sel_pojo> getts(Sel_pojo sp)
	{
		return ss.getts(sp);
	}
	@PutMapping("p2")
	public Sel_pojo puts(@RequestBody Sel_pojo sp)
	{
		return ss.puts(sp);
	}
	@DeleteMapping("d2")
	public String dels(@RequestBody Sel_pojo sp)
	{
		 ss.dels(sp);
		 return "Deletion successful";
	}
	
}
