package com.example.Salle.DAO.ReservationEquipement;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.Salle.Entities.ReservationEquipement;



public interface ReservationEquipementRepository extends JpaRepository<ReservationEquipement,Long> {
	
	@Query(value=" Select e.nom ,e.nom_photo,e.prix from equipement e,reservation r,reservation_equipement rs where e.id=rs.equipement_id AND r.id=rs.reservation_id",nativeQuery=true)
	List<NameOnce> getData();
	
	
	
	public static interface NameOnce {

	     String getNom();
	     int getPrix();
	     String getNomPhoto();
	     
	     
	     

	  }


}
