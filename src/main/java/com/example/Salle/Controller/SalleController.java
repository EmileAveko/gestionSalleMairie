package com.example.Salle.Controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
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


import com.example.Salle.Entities.Salle;
import com.example.Salle.Service.SalleService;

@RestController
@CrossOrigin(origins="*")
public class SalleController {
	
	@Autowired
	private SalleService salleservice;
	
	

	
	public SalleController(SalleService salleservice) {
	
		this.salleservice = salleservice;
	}

	
	@RequestMapping(method = RequestMethod.GET,value="/salles")
	public List<Salle> getAllSalles(){
		return salleservice.retrieveSalle();
		
	}
	
	
	@GetMapping("/salles/{id}")
	public Salle getSalle(@PathVariable Long id) {
		return salleservice.getSalle(id);
	}
	
	
	@GetMapping("/sallesnome/{nomsalle}")
	public Salle findSalle(@PathVariable String nomsalle) {
		return salleservice.findSalle(nomsalle);
	}
	
	@PostMapping("/salle")
	public void addSalle(@RequestBody Salle salle) {
	  salleservice.createSalle(salle);	
	}
	
	
	
	@PutMapping("/saller")
	public void updateSalle(@RequestBody Salle salle) {
		salleservice.updateSalle( salle);
	}
	
	
	
   @DeleteMapping("saller/{id}")
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
	


	@RequestMapping(method = RequestMethod.GET,value="/info")
	public Set<Salle> getInfo(){
		return salleservice.getSales();
	}
	
}
