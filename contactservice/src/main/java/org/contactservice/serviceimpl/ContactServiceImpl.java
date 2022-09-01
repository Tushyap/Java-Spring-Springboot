package org.contactservice.serviceimpl;

import java.util.List;
import java.util.stream.Collectors;

import org.contactservice.model.Contact;
import org.contactservice.service.ContactService;
import org.springframework.stereotype.Service;

@Service
public class ContactServiceImpl implements ContactService{
	
	//Contact information
	
		List<Contact> list=List.of(
				new Contact (1L, "tushyap@gmail.com", "tushyap",112L ),
				new Contact (2L, "Shivam@gmail.com", "shivam",113L ),
				new Contact (3L, "vishu@gmail.com", "vishu",114L )
			);

		public List<Contact> getContactOfUser(Long userId){
			return list.stream()
					.filter( contact -> contact.getUserId().equals(userId))
					.collect(Collectors.toList());
		}

}
