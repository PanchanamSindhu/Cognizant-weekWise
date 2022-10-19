package com.cog.junit.controllertest;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cog.junit.controller.PersonController;
import com.cog.junit.repository.PersonRepository;
import com.fasterxml.jackson.databind.Module.SetupContext;


@ExtendWith(MockitoExtension.class)
public class PersonControllerTest {
	
	@Mock
	PersonRepository pr;
	
	@InjectMocks
	PersonController pc;
	
//	@BeforeEach
//	void Setup() {
//		this.pc.getPersons()
//	}
	
	
	@Test
	void getAllperson() {
		pc.getPersons();
		verify(pr).findAll();
		
	}
	

}
