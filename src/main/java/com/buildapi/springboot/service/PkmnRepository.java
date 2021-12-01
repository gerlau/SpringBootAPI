package com.buildapi.springboot.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.buildapi.springboot.model.Pkmn;

public interface PkmnRepository extends JpaRepository<Pkmn, Integer>{
	
	Pkmn findById(int id);
	List<Pkmn> findAll();
}
