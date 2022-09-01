package org.contactservice.service;

import java.util.List;

import org.contactservice.model.Contact;

public interface ContactService {
	
	public List<Contact> getContactOfUser(Long userId);

}
