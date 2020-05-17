package com.example.Salle.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import com.example.Salle.DAO.Salle.SalleRepository;
import com.example.Salle.Entities.Salle;

public class SalleService {

	
	@Autowired
	private SalleRepository salleRepo;

	public SalleService(SalleRepository equipementRepo) {
		this.salleRepo = equipementRepo;
	}
	
	public Salle createSalle(Salle salle) {
		return salleRepo.save(salle);
	}

	public List<Salle> createSalles(List<Salle> listsalle)
	{
		return salleRepo.saveAll(listsalle);
	}
	
	public Salle updateSalle(Salle salle) {
		
		Salle existingsalle= salleRepo.findById(salle.getID()).orElse(null);
		existingsalle.setNom(salle.getNom());
		existingsalle.setListreservation(existingsalle.getListreservation());
		existingsalle.setPrix(salle.getPrix());
		existingsalle.setAdresse(salle.getAdresse());
		existingsalle.setCapmax(salle.getCapmax());
		existingsalle.setCapmin(salle.getCapmin());
		existingsalle.setListEquipements(salle.getListEquipements());
		existingsalle.setListgardien(salle.getListgardien());
		
		return salleRepo.save(existingsalle);
	}
	
	public void deleteSalle(Long id) {
		 salleRepo.deleteById(id);
	}
	
	public Salle getSalle(Long id) {
		return salleRepo.findById(id).orElse(null);
	}
	
	public List<Salle> retrieveSalle(){
		List<Salle> listesalle= new ArrayList<Salle>();
		salleRepo.findAll().forEach(listesalle::add);
		return listesalle;

	
}

}
