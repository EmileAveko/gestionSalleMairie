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
import org.springframework.web.bind.annotation.RestController;


import com.example.Salle.Entities.Gardien;

import com.example.Salle.Service.GardienService;

@RestController
public class GardienController {

	@Autowired
	private GardienService gardienService;

	public GardienController(GardienService gardienService) {
		this.gardienService = gardienService;
	}

	@RequestMapping(method = RequestMethod.GET,value="/gardiens")
	public List<Gardien> getAllGardienss(){
		return gardienService.retrieveGardiens();
		
	}
	
	
	@GetMapping("/gardiens/{id}")
	public Gardien getGardien(@PathVariable Long id) {
		return gardienService.getGardien(id);
	}
	
	
	@PostMapping("/gardien")
	public void addGardien(@RequestBody Gardien gardien) {
	  gardienService.createGardien(gardien);	
	}
	
	
	
	@PutMapping("/gardienne")
	public void updateClient(@RequestBody Gardien gardien) {
		gardienService.updateGardien( gardien);
	}
	
	
	
   @DeleteMapping("gardienage{id}")
   public void deleteGardien(@PathVariable Long id)	
   {
	   gardienService.deleteGardien(id);
   }
   
   
   
	public GardienService getGardienservice() {
		return this.gardienService;
	}

	public void setClientservice(GardienService gardienservice) {
		this.gardienService = gardienservice;
	}

	

}