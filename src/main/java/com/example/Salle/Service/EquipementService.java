package com.example.Salle.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Salle.DAO.Equipement.EquipementRepository;
import com.example.Salle.Entities.Equipement;

@Service
public class EquipementService {

	@Autowired
	private EquipementRepository equipementRepo;

	public EquipementService(EquipementRepository equipementRepo) {
		this.equipementRepo = equipementRepo;
	}
	
	public Equipement createEquipement(Equipement equipement) {
		return equipementRepo.save(equipement);
	}

	public List<Equipement> createEquipements(List<Equipement> listequipement)
	{
		return equipementRepo.saveAll(listequipement);
	}
	
	public Equipement updateEquipement(Equipement equipement) {
		
		Equipement existingequipement= equipementRepo.findById(equipement.getId()).orElse(null);
		existingequipement.setNom(equipement.getNom());
		//existingequipement.setNomPhoto(equipement.getNomPhoto());
		existingequipement.setPrix(equipement.getPrix());
		existingequipement.setReservationequipement(equipement.getReservationequipement());
		existingequipement.setListImageEquipement(equipement.getListImageEquipement());
		//existingequipement.setPhoto(equipement.getPhoto());
		//existingequipement.setSalle(equipement.getSalle());
		return equipementRepo.save(existingequipement);
		
	}
	
	public void deleteEquipement(Long id) {
		 equipementRepo.deleteById(id);
	}
	
	public Equipement getEquipement(Long id) {
		return equipementRepo.findById(id).orElse(null);
	}
	
	public List<Equipement> retrieveEquipement(){
		/*List<Equipement> listequipement= new ArrayList<Equipement>();
		equipementRepo.findAll().forEach(listequipement::add);
		return listequipement;	*/
		return equipementRepo.findAll();
}
	
	public List<Equipement> getEquipementByReservation(Long id){
		return equipementRepo.getEquipementByReservation(id);
	}
	
}
