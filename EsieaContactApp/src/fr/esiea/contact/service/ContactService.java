package fr.esiea.contact.service;

import java.util.List;

import fr.esiea.contact.dao.ContactDAO;
import fr.esiea.contact.model.Contact;

public class ContactService {
	
	
	private ContactDAO contactDao;
	
	public ContactService( ContactDAO contactDao ) 
	{
		this.contactDao = contactDao;
	}
	public void setContactDao( ContactDAO contactDao )
	{
		this.contactDao = contactDao;
	}

	public boolean addContact(Contact contact) {
	    return contactDao.addContact(contact);
	}
	public List<Contact> listContact() {
		return contactDao.listContact();
	}  

	public Contact getContact( String id ) {
		
		return contactDao.getContact( id );
		
	}
}
