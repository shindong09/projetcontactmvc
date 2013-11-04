package fr.esiea.contact.dao;

import java.util.List;

import fr.esiea.contact.model.Contact;

public interface ContactDAO {
	
    public boolean addContact(Contact contact);
    public List<Contact> listContact();
    //public void removeContact(Integer id);
	public Contact getContact(String id);

}
