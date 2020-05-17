package com.example.Salle.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.Salle.Entities.Salle;
import com.example.Salle.Service.SalleService;

public class SalleController {
	
	@Autowired
	private SalleService salleservice;
	
	

	
	public SalleController(SalleService salleservice) {
	
		this.salleservice = salleservice;
	}

	
	@RequestMapping(method = RequestMethod.GET,value="/clients")
	public List<Salle> getAllClients(){
		return salleservice.retrieveSalle();
		
	}
	
	
	@GetMapping("/clients/{id}")
	public Salle getSalle(@PathVariable Long id) {
		return salleservice.getSalle(id);
	}
	
	
	@PostMapping("/client")
	public void addSalle(@RequestBody Salle salle) {
	  salleservice.createSalle(salle);	
	}
	
	
	
	@PutMapping("/cliente")
	public void updateSalle(@RequestBody Salle salle) {
		salleservice.updateSalle( salle);
	}
	
	
	
   @DeleteMapping("clientel/{id}")
   public void deleteClient(@PathVariable Long id)	
   {
	   salleservice.deleteSalle(id);
   }
   
   
   
	public SalleService getSalleservice() {
		return salleservice;
	}

	public void setSalleservice(SalleService salleservice) {
		this.salleservice = salleservice;
	}
	


}
