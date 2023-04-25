package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Cricket;
import com.example.demo.service.CricketService;

@RestController
public class CricketController{
	@Autowired
	public CricketService cServ;
	@PostMapping("/post")
	public Cricket saveDetails(@RequestBody Cricket sm)
	{
		return cServ.saveDetails(sm);
	}
	@GetMapping("/getsweet")
	public List<Cricket>getDetails()
	{
		return cServ.getDetails();
	}
	@PutMapping("/put")
	public Cricket update(@RequestBody Cricket id )
	{
		return cServ.updateDetails(id);
	}
	@DeleteMapping("/delete/{id}")
	public String deleteDetails(@PathVariable("id") int hid)
	{
		cServ.deleteDetails(hid);
		return "deleted";
	}
	@DeleteMapping("/deletes")
	public String deleteBypara(@RequestParam ("id") int sid)
	{
		cServ.deleteDetails(sid);
		return sid+" is deleted";
	}
	
}


