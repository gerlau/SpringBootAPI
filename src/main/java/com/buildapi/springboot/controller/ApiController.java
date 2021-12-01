package com.buildapi.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.buildapi.springboot.model.Pkmn;
import com.buildapi.springboot.service.PkmnRepository;

@RestController
public class ApiController {
	
	@Autowired
	PkmnRepository repo;
	
	@RequestMapping("/findall")
	public List<Pkmn> findAll() {
		
		List<Pkmn> customers = repo.findAll();
		return customers;
	}
	
	@RequestMapping("/pkmn/{id}")
	public Pkmn findById(@PathVariable int id) {
		
		Pkmn pkmn = repo.findById(id);
		return pkmn;
	}
}
