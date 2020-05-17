package com.example.Salle.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Salle.DAO.Employe.EmployeRepository;
import com.example.Salle.Entities.Employe;

@Service
public class EmployeService {

	
	@Autowired
	private EmployeRepository employeRepo;

	public EmployeService(EmployeRepository employeRepo) {
		this.employeRepo = employeRepo;
	}
	
	public Employe createEmploye(Employe employe) {
		return employeRepo.save(employe);
	}

	public List<Employe> createEmployes(List<Employe> listemploye)
	{
		return employeRepo.saveAll(listemploye);
	}
	
	public Employe updateEmploye(Employe employe) {
		
		Employe existingemploye= employeRepo.findById(employe.getID()).orElse(null);
		existingemploye.setNom(employe.getNom());
		existingemploye.setSexe(employe.getSexe());
		existingemploye.setDateNaissance(employe.getDateNaissance());
		existingemploye.setMot_de_passe(employe.getMot_de_passe());
		existingemploye.setListreservation(employe.getListreservation());
		return employeRepo.save(existingemploye);
	}
	
	public void deleteEmploye(Long id) {
		 employeRepo.deleteById(id);
	}
	
	public Employe getEmploye(Long id) {
		return employeRepo.findById(id).orElse(null);
	}
	
	public List<Employe> retrieveEmployes(){
		List<Employe> listemploye= new ArrayList<Employe>();
		employeRepo.findAll().forEach(listemploye::add);
		return listemploye;
		
	}

}
