package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Ord_pojo;
import com.example.demo.service.Ord_sc;

@RestController
public class Order {
	@Autowired
    Ord_sc os;
	
	@PostMapping("po3")
	public Ord_pojo posttt(@RequestBody Ord_pojo op)
	{
		return os.postt(op);
	}
	@GetMapping("g3") 
	public List <Ord_pojo> gett(Ord_pojo op)
	{
		return os.gett(op);
	}
	@GetMapping("gid3") 
	public Optional <Ord_pojo> gettin(@RequestParam int id)
	{
		return os.gettn(id);
	}
	@GetMapping("gi3/{date}") 
	public List <Ord_pojo> getso(@PathVariable String date)
	{
		return os.sortu(date);
	}
	@PutMapping("p3")
	public Ord_pojo putt(@RequestBody Ord_pojo op)
	{
		return os.putt(op);
	}
	@PutMapping("pid3/{id}")
	public String puttin(@PathVariable int id,@RequestBody Ord_pojo op)
	{
		return os.uid(id,op);
	}
	
	@DeleteMapping("d3")
	public String delt(@RequestBody Ord_pojo op)
	{
		os.delt(op);
		return "Deletion successful";
	}
	@DeleteMapping("did3/{id}")
	public void deltin(@PathVariable int id)
	{
		os.deltn(id);
	}

}
