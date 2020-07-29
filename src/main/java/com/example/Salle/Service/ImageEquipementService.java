package com.example.Salle.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.Salle.DAO.ImageEquipement.ImageEquipementRepository;
import com.example.Salle.Entities.ImageEquipement;


@Service
public class ImageEquipementService {
	
	
		
		@Autowired
		private ImageEquipementRepository imageequipeRepo;
	  
		
	
		
		public ImageEquipement createImageEquipement(ImageEquipement image) {
			return imageequipeRepo.save(image);
		}

		public List<ImageEquipement> createImageEquipements(List<ImageEquipement> imagesequi)
		{
			return imageequipeRepo.saveAll(imagesequi);
		}
		
		public ImageEquipement updateImageEquipements(ImageEquipement imageequipe) {
			
			ImageEquipement existingequippic= imageequipeRepo.findById(imageequipe.getId()).orElse(null);
			existingequippic.setNomphoto(imageequipe.getNomPhoto());
			existingequippic.setType(imageequipe.getType());
			existingequippic.setPhoto(imageequipe.getPhoto());
		   
			
			return imageequipeRepo.save(existingequippic);
			
		}
		
		public void deleteImageEquipe(Long id) {
			imageequipeRepo.deleteById(id);
		}
		
		public ImageEquipement getEquipementImage(Long id) {
			return imageequipeRepo.findById(id).orElse(null);
		}
		
		public Optional<ImageEquipement> getEquipementImage(String nom) {
			return imageequipeRepo.findByNomPhoto(nom);
		}
		
		public List<ImageEquipement> retrieveClients(){
		
			
			return imageequipeRepo.findAll();
		}
		
	}



