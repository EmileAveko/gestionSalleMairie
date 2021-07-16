package com.example.Salle.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Salle.DAO.Salle.SalleRepository;
import com.example.Salle.Entities.Salle;

@Service
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
		
		Salle existingsalle= salleRepo.findById(salle.getId()).orElse(null);
		existingsalle.setNomsal(salle.getNomsal());
		existingsalle.setPrix(salle.getPrix());
		existingsalle.setAdress(salle.getAdress());
		existingsalle.setCapmax(salle.getCapmax());
		existingsalle.setCapmin(salle.getCapmin());
		existingsalle.setListEquipements(salle.getListEquipements());
		existingsalle.setListgardien(salle.getListgardien());
		existingsalle.setSurface(salle.getSurface());
		existingsalle.setEtat(salle.getEtat());
		existingsalle.setListreservation(salle.getListReservations());
		
		return salleRepo.save(existingsalle);

	}
	
	public void deleteSalle(Long id) {
		 salleRepo.deleteById(id);
	}
	
	public Salle getSalle(Long id) {
		return salleRepo.findById(id).orElse(null);
	}
	
	public List<Salle> retrieveSalle(){
		/*ist<Salle> listesalle= new ArrayList<Salle>();
		salleRepo.findAll().forEach(listesalle::add);
		return listesalle;*/
		return salleRepo.findAll();
	}
	
	public Salle findSalle(String nomSalle) {
		return salleRepo.findByNomsal(nomSalle);
	}

	
	
	public Set<Salle> getSales(){
		return salleRepo.getInfo();
	}
}
