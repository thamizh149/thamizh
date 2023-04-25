package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Cricket;
import com.example.demo.repository.CricketRepo;

@Service
public class CricketService<SweetStall1> {
@Autowired
public CricketRepo  crepo;

public Cricket saveDetails(Cricket sm)
{
	return crepo.save(sm);
}
//getting the information
public List<Cricket> getDetails()
{
	return crepo.findAll();
}
//updating the information
public Cricket updateDetails(Cricket j)
{
	return crepo.saveAndFlush(j);
}
//deleting the information
public void deleteDetails(int id)
{
	crepo.deleteById(id);
}



}




