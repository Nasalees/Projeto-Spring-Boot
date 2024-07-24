package com.projetoSpring.userdept.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetoSpring.userdept.entities.User;
import com.projetoSpring.userdept.repositories.UserReposity;

@RestController
@RequestMapping(value = "/users")
public class UserControler {
	
	@Autowired
	private UserReposity repository;
	
	@GetMapping
	public List<User> findAll(){
		List<User> result  = repository.findAll();
		return result;
	}
}
