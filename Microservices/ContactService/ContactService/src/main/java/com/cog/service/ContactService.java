package com.cog.service;

import java.util.List;

import com.cog.entity.Contact;

public interface ContactService {
	public List<Contact> getContactOfuser(Long id);

}
