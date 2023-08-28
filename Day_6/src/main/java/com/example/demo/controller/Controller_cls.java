package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Entity_cls;
import com.example.demo.service.Service_cls;

@RestController
public class Controller_cls {
@Autowired
Service_cls scl;

@PostMapping("po")
public Entity_cls postf(@RequestBody Entity_cls ec)
{
	return scl.post(ec);
}
@GetMapping("ge")
public List <Entity_cls> getf(@RequestBody Entity_cls ec)
{
	return scl.gett(ec);
}
@PutMapping("pu")
public Entity_cls putf(@RequestBody Entity_cls ec)
{
	return scl.put(ec);
}
@DeleteMapping("del")
public String deletef(@RequestBody  Entity_cls ec)
{
	 scl.delete(ec);
	 return "Successful deletion";
}
@GetMapping("gna/{name}")
public List <Entity_cls> sortf(@PathVariable String name)
{
	return scl.sort(name);
}
@GetMapping("gep/{pgno}/{pgsize}")
public List <Entity_cls> getpg(@PathVariable int pgno,@PathVariable int pgsize)
{
	return scl.page(pgno,pgsize);
}
}
