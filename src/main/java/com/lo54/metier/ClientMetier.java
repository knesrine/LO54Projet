package com.lo54.metier;

import java.util.List;

import com.lo54.entities.Client;

public interface ClientMetier {
	
	//ajouter client
	public Client addClient(Client client);
	
	//selection de la liste des clients
	public List<Client> listClient();
	
	
	
}
