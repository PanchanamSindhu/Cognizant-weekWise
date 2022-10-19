package com.cog.junit.servicetest;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.cog.junit.repository.PersonRepository;
import com.cog.junit.service.PersonService;

@ExtendWith(MockitoExtension.class)
public class PersonServiceTest {
	
	@Mock
	PersonRepository personrepo;
	
	@InjectMocks
	PersonService personService;
	
	

}
