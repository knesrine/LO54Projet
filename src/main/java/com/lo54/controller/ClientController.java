package com.lo54.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lo54.entities.Client;
import com.lo54.metier.ClientMetier;

@Controller
public class ClientController {

	@Autowired
	private ClientMetier clientMetier;
	
	//Formulaire à remplir
	
	public String formClient(Model model) {
		model.addAttribute("client", new Client());
		return "form/formClient";
	}
	
	
	public void addCourseSession(int idcourseSession ,Client client ) {
		
	}
	//Ajouter client après remplissage formulaire
	@RequestMapping(method=RequestMethod.POST,value="/Client/add")
	public String addClient(Model model,@ModelAttribute("client") Client client) {
		clientMetier.addClient(client);
		return "redirect:listClient" ;
	}
	
	
}
