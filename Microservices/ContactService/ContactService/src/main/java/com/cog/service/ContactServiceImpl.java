package com.cog.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.cog.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService {

	List<Contact> contactList = List.of(new Contact(1L, "abc@gmail.com", 22L), new Contact(2L, "abc@gmail.com", 23L),
			new Contact(3L, "aefg@gmail.com", 24L), new Contact(4L, "hij@gmail.com", 25L),
			new Contact(5L, "klm@gmail.com", 26L), new Contact(6L, "mno@gmail.com", 27L));

	@Override
	public List<Contact> getContactOfuser(Long id) {
		return contactList.stream().filter(con -> con.getUserID().equals(id)).collect(Collectors.toList());
	}

}
