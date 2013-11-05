package fr.esiea.contact.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;

import fr.esiea.contact.service.*;
import fr.esiea.contact.dao.ContactDAOImpl;
//import fr.esiea.contact.dao.ContactDao;
import fr.esiea.contact.model.Contact;
import fr.esiea.contact.service.ContactService;

@Controller
public class ContactController {
	

	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public ModelAndView index() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("welcome");
		modelAndView.addObject("firstname", new Contact());
		modelAndView.addObject("lastname", new Contact());
		modelAndView.addObject("email", new Contact());
		modelAndView.addObject("birthday", new Contact());
		return modelAndView; 
	}	
	
	@RequestMapping(value = "/home", method = RequestMethod.POST)
	public String accessHome(@ModelAttribute("SpringWeb")Contact contact, 
	ModelMap model) {
	   model.addAttribute("lastname", contact.getLastname());
	   model.addAttribute("firstname", contact.getFirstname());
	   //model.addAttribute("contactList", service.getContacts(contact.getEmail()));
	   return "home";
	}	


	@RequestMapping(value = "/addcontact", method = RequestMethod.GET)
	public ModelAndView student() {
	   return new ModelAndView("addcontact", "command", new Contact());
	}
	
	@RequestMapping(value = "/homecontact", method = RequestMethod.POST)
	public String addContact(@ModelAttribute("SpringWeb")Contact contact, 
	ModelMap model) {
	   model.addAttribute("lastname", contact.getLastname());
	   model.addAttribute("firstname", contact.getFirstname());
	   model.addAttribute("lastname", contact.getEmail());
	   model.addAttribute("firstname", contact.getBirthday());
	   return "homecontact";
	}

}
