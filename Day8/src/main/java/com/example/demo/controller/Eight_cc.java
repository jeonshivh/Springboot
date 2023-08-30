package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Eight_mc;
import com.example.demo.service.Eight_sc;

@RestController
public class Eight_cc {
@Autowired
Eight_sc es;

@PostMapping("pos")
public List<Eight_mc> postin(@RequestBody List <Eight_mc> em)
{
  return (List <Eight_mc>)es.postdeta(em);	
}
@GetMapping("getall")
public List<Eight_mc> gettg()
{
  return es.getfull();	
}
@GetMapping("get/{year}")
public List<Eight_mc> getino(@PathVariable int year)
{
  return es.geton(year);	
}
@GetMapping("get/{year}/{bikename}")
public List<Eight_mc> getint(@PathVariable int year,@PathVariable String bikename)
{
  return es.getsec(year,bikename);	
}

}
