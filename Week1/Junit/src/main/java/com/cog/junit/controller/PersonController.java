package com.cog.junit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.cog.junit.model.Person;
import com.cog.junit.service.PersonService;

@RestController
public class PersonController {
	
	@Autowired
	private PersonService ps;
	
	public List<Person> getPersons() {
		return ps.allPerson();
		
	}
	
	public void personById(Integer id) {
		System.out.println(ps.getPersonById(id));
	}

}
