package com.example.Salle.Controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.Salle.Entities.Client;
import com.example.Salle.Service.ClientService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class ClientController {

	@Autowired
	private ClientService clientservice;
	
	

	
	public ClientController(ClientService clientservice) {
	
		this.clientservice = clientservice;
	}

	
	@RequestMapping(method = RequestMethod.GET,value="/clients")
	public List<Client> getAllClients(){
		return clientservice.retrieveClients();
		
	}
	
	
	@GetMapping("/clients/{id}")
	public Client getClient(@PathVariable Long id) {
		return clientservice.getClient(id);
	}
	
	@GetMapping("/clientes/{nom}")
	public Client getCliente(@PathVariable String nom) {
		return clientservice.getCliente(nom);
	}
	
	
	@PostMapping("/client")
	public void addClient(@RequestBody Client client) {
	  clientservice.createClient(client);	
	}
	
	
	
	@PutMapping("/cliente")
	public void updateClient(@RequestBody Client client) {
		clientservice.updateClient( client);
	}
	
	
	
   @DeleteMapping("clientel/{id}")
   public void deleteClient(@PathVariable Long id)	
   {
	   clientservice.deleteClient(id);
   }
   
   
   
   
	
	
	
	
	
	
}
