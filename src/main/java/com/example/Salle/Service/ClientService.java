package com.example.Salle.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.hibernate.mapping.Array;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.Salle.DAO.Client.ClientRepository;
import com.example.Salle.Entities.Client;

@Service
public class ClientService {
	
	
	@Autowired
	private ClientRepository clientRepo;
  
	
	public ClientService(ClientRepository clientRepo) {
		this.clientRepo = clientRepo;
	}
	
	public Client createClient(Client client) {
		return clientRepo.save(client);
	}

	public List<Client> createClients(List<Client> listclient)
	{
		return clientRepo.saveAll(listclient);
	}
	
	public Client updateClient(Client client) {
		
		Client existingclient= clientRepo.findById(client.getId()).orElse(null);
		existingclient.setNom(client.getNom());
		existingclient.setSexe(client.getSexe());
		existingclient.setDateNaissance(client.getDateNaissance());
	    existingclient.setContact(client.getContact());
		existingclient.setMail(client.getMail());
		existingclient.setListreservation(client.getListreservation());
		
		return clientRepo.save(existingclient);
		
	}
	
	public void deleteClient(Long id) {
		 clientRepo.deleteById(id);
	}
	
	public Client getClient(Long id) {
		return clientRepo.findById(id).orElse(null);
	}
	
	public Client getCliente(String mail) {
		return clientRepo.findByMail(mail);
	}
	
	public List<Client> retrieveClients(){
		
		
		return clientRepo.findAll();
	}
	
}
