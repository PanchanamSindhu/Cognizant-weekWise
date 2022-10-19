package com.cog.junit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cog.junit.model.Person;
import com.cog.junit.repository.PersonRepository;

@Service
public class PersonService {
	
	@Autowired
	private PersonRepository personRepository;
	
	public List<Person> allPerson(){
		return personRepository.findAll();
	}

	
	public Person getPersonById(Integer id) {
		Person person = null;
		Optional<Person> personData = personRepository.findById(id);
		if(personData.isPresent()) {
			person = personData.get();
		}
		return person;
	}
}
