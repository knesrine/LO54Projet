package com.lo54.metierImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lo54.dao.ClientRepository;
import com.lo54.entities.Client;
import com.lo54.metier.ClientMetier;

@Service
public class ClientMetierImpl implements ClientMetier {

	@Autowired
	private ClientRepository clientRepository;

	@Override
	public Client saveClient(Client client) {
		return clientRepository.save(client);
	}

	@Override
	public void updateClient(Client client) {
		saveClient(client);
		
	}

	@Override
	public void deleteClient(Client client) {
		clientRepository.delete(client);
	}

	@Override
	public List<Client> listClient() {
		return clientRepository.findAll();
	}
	
	
}
