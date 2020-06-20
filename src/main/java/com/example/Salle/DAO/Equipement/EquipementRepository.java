package com.example.Salle.DAO.Equipement;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.Salle.DAO.ReservationEquipement.ReservationEquipementRepository.NameOnce;
import com.example.Salle.Entities.Equipement;



public interface EquipementRepository extends JpaRepository<Equipement,Long> {

	
	@Query(value=" Select e.id,e.nom ,e.nom_photo,e.prix,e.salle_id from equipement e,reservation_equipement rs  WHERE e.id=rs.equipement_id AND rs.reservation_id=:idReservation",nativeQuery=true)
	List<Equipement> getEquipementByReservation(@Param("idReservation")Long idreservation);
	
}
