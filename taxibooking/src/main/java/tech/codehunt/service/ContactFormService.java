package tech.codehunt.service;

import java.util.List;

import tech.codehunt.model.ContactForm;


public interface ContactFormService {

	public ContactForm saveContactFormService(ContactForm contactForm);
	
	public List <ContactForm> readAllContactsService();
	public void deleteContactsService(int id);

}
