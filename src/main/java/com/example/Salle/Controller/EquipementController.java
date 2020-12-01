package com.example.Salle.Controller;

import java.util.List;

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

import com.example.Salle.Entities.Equipement;
import com.example.Salle.Service.EquipementService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class EquipementController {

	@Autowired
	private EquipementService equipementservice;
	
	

	
	public EquipementController(EquipementService equipementservice) {
	
		this.equipementservice = equipementservice;
	}

	
	@RequestMapping(method = RequestMethod.GET,value="/equipements")
	public List<Equipement> getAllEquipement(){
		return equipementservice.retrieveEquipement();
		
	}
	
	
	@GetMapping("/equipements/{id}")
	public List<Equipement> getEquipement(@PathVariable Long id) {
		return equipementservice.getEquipementByReservation(id);
	}
	
	
	@PostMapping("/equipement")
	public void addEquipement(@RequestBody Equipement equipement) {
	  equipementservice.createEquipement(equipement);	
	}
	
	
	
	@PutMapping("/equipementtier")
	public void updateEquipement(@RequestBody Equipement equipement) {
		equipementservice.updateEquipement(equipement);
	}
	
	
	
   @DeleteMapping("equipement/{id}")
   public void deleteEquipement(@PathVariable Long id)	
   {
	   equipementservice.deleteEquipement(id);
   }
   
   
   
	public EquipementService getClientservice() {
		return equipementservice;
	}

	public void setEquipementService(EquipementService equipementservice) {
		this.equipementservice = equipementservice;
	}
	
	
	@GetMapping("/equipementsReserver/{id}")
	public List<Equipement> getEquipementReservation(@PathVariable Long id) {
		return equipementservice.getEquipementByReservation(id);
	}
	

}
