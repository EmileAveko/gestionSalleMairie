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

import com.example.Salle.Entities.Employe;
import com.example.Salle.Service.EmployeService;



@RestController
//@CrossOrigin(origins="http://localhost:4200")
public class EmployeController {

	
	
	@Autowired
	private EmployeService employeService;

	public EmployeController(EmployeService employeService) {
		this.employeService = employeService;
	}

	@RequestMapping(method = RequestMethod.GET,value="/employes")
	public List<Employe> getAllEmployes(){
		return employeService.retrieveEmployes();
		
	}
	
	
	@GetMapping("/employe/{id}")
	public Employe getEmploye(@PathVariable Long id) {
		return employeService.getEmploye(id);
	}
	
	
	@PostMapping("/employe")
	public void addEmploye(@RequestBody Employe employe) {
	  employeService.createEmploye(employe);	
	}
	
	
	
	@PutMapping("/emploie")
	public void updateEmploye(@RequestBody Employe employe) {
		employeService.updateEmploye( employe);
	}
	
	
	
   @DeleteMapping("/emploi/{id}")
   public void deleteGardien(@PathVariable Long id)	
   {
	   employeService.deleteEmploye(id);
   }
   
   
   
	public EmployeService getEmployeservice() {
		return this.employeService;
	}

	public void setClientservice(EmployeService employeService) {
		this.employeService = employeService;
	}

	

}
