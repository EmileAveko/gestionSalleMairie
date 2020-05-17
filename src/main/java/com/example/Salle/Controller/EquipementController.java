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

import com.example.Salle.Entities.Client;
import com.example.Salle.Entities.Equipement;
import com.example.Salle.Service.ClientService;
import com.example.Salle.Service.EquipementService;

public class EquipementController {

	@Autowired
	private EquipementService equipementservice;
	
	

	
	public EquipementController(EquipementService equipementservice) {
	
		this.equipementservice = equipementservice;
	}

	
	@RequestMapping(method = RequestMethod.GET,value="/clients")
	public List<Equipement> getAllClients(){
		return equipementservice.retrieveEquipement();
		
	}
	
	
	@GetMapping("/clients/{id}")
	public Equipement getEquipement(@PathVariable Long id) {
		return equipementservice.getEquipement(id);
	}
	
	
	@PostMapping("/client")
	public void addEquipement(@RequestBody Equipement equipement) {
	  equipementservice.createEquipement(equipement);	
	}
	
	
	
	@PutMapping("/cliente")
	public void updateEquipement(@RequestBody Equipement equipement) {
		equipementservice.updateEquipement(equipement);
	}
	
	
	
   @DeleteMapping("clientel/{id}")
   public void deleteEquipement(@PathVariable Long id)	
   {
	   equipementservice.deleteEquipement(id);;
   }
   
   
   
	public EquipementService getClientservice() {
		return equipementservice;
	}

	public void setEquipementService(EquipementService equipementservice) {
		this.equipementservice = equipementservice;
	}
	

}
