package com.example.demo.controlller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Sev_model;
import com.example.demo.service.Seven_sercls;

@RestController
public class Seven_cont {
	@Autowired
	Seven_sercls so;
	@PostMapping("po")
	public List <Sev_model> postde(@RequestBody List <Sev_model> sm )
	{
		return (List<Sev_model>)so.post(sm);
	}
	@GetMapping("get")
	public List <Sev_model> getdeti(@RequestBody List<Sev_model> sm)
	{
		return so.getok(sm);
	}
	@GetMapping("g1/{owners}")
	public List <Sev_model> getf(@PathVariable int owners)
	{
		return so.geto(owners);
	}
	@GetMapping("g2/{address}")
	public List <Sev_model> getse(@PathVariable String address)
	{
		return so.geta(address);
	}
	@GetMapping("g3/{carName}")
	public List <Sev_model> getthi(@PathVariable String carName)
	{
		return so.getc(carName);
	}
	@GetMapping("g4/{owner}/{owncar}")
	public List <Sev_model> getfour(@PathVariable int owner ,@PathVariable String owncar)
	{
		return so.getoc(owner,owncar);
	}

}
