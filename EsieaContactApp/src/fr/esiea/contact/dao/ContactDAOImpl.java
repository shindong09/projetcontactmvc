package fr.esiea.contact.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import fr.esiea.contact.model.Contact;

public class ContactDAOImpl implements ContactDAO{

	
	
	
	private HashMap<String, ArrayList<Contact>> db = new HashMap<String, ArrayList<Contact>>();
	private ArrayList<Contact> users = new ArrayList<Contact>();
	int count = 0;
	public ContactDAOImpl() {


	}

	@Override
	public boolean addContact(Contact contact) {
		return true;
		// TODO Auto-generated method stub


		
	}

	@Override
	public List<Contact> listContact() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contact getContact(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
