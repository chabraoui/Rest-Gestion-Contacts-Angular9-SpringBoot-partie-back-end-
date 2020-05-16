package com.sid.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sid.dao.ContactsRepository;
import com.sid.entities.Contacts;

@RestController
@CrossOrigin("*")
public class ContactsService {
	@Autowired
private ContactsRepository contactsRepository;
	@RequestMapping( value="/Contact",method = RequestMethod.POST)
	public Contacts saveContacts(@RequestBody Contacts c) {
		return contactsRepository.save(c);
	}
	@RequestMapping(value="/Contact", method = RequestMethod.GET)
	public List<Contacts> getContacts(){
	return	contactsRepository.findAll();
	}
	@RequestMapping(value="/Contact/{id}", method = RequestMethod.GET)
	public Contacts getoneContact(@PathVariable long id) {
		return contactsRepository.findById(id).get();
	}
	@RequestMapping(value = "/Contact/{id}", method = RequestMethod.DELETE)
	public boolean deleteContact(@PathVariable long id) {
		contactsRepository.deleteById(id);
		return true;
	}
	@RequestMapping(value = "/Contact/{id}", method = RequestMethod.PUT)
	public Contacts updateContact(@RequestBody Contacts c, @PathVariable long id) {
	Contacts cl=getoneContact(id);
	cl.setNom(c.getNom());
	cl.setEmail(c.getEmail());
	cl.setPrenom(c.getPrenom());
	cl.setTel(c.getTel());
		return contactsRepository.save(cl);
	}
	
}
