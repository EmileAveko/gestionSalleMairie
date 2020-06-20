package com.example.Salle.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Salle.DAO.Gardien.*;
import com.example.Salle.Entities.Gardien;

@Service
public class GardienService {

	@Autowired
	private GardienRepository gardienRepo;

	public GardienService(GardienRepository gardienRepo) {
		this.gardienRepo = gardienRepo;
	}
	
	public Gardien createGardien(Gardien gardien) {
		return gardienRepo.save(gardien);
	}

	public List<Gardien> createGardiens(List<Gardien> listequipement)
	{
		return gardienRepo.saveAll(listequipement);
	}
	
	public Gardien updateGardien(Gardien gardien) {
		
		Gardien existinggardien= gardienRepo.findById(gardien.getId()).orElse(null);
		existinggardien.setNom(gardien.getNom());
		existinggardien.setSexe(gardien.getSexe());
		existinggardien.setDateNaissance(gardien.getDateNaissance());
		//existinggardien.setsalle(gardien.getsalle());
		return gardienRepo.save(existinggardien);
	
	}
	
	public void deleteGardien(Long id) {
		 gardienRepo.deleteById(id);
	}
	
	public Gardien getGardien(Long id) {
		return gardienRepo.findById(id).orElse(null);
	}
	
	public List<Gardien> retrieveGardiens(){
		/*List<Gardien> listequipement= new ArrayList<Gardien>();
		gardienRepo.findAll().forEach(listequipement::add);
		return listequipement;*/
		return gardienRepo.findAll();

}
}
