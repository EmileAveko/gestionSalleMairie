package com.example.Salle.DAO.Reservation;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.Salle.Entities.Reservation;
import com.example.Salle.Entities.Salle;


public interface ReservationRepository extends JpaRepository<Reservation,Long>{
	
	@Query(value=" Select c.nom, c.date_naissance, c.mail, c.status ,s.capmin ,s.surface ,s.capmax, s.adress ,r.nomev,s.prix,r.heuredep,r.heurefin,s.nomsal,r.nbrpers,r.id  from client c, salle s , reservation r WHERE c.id =r.client_id AND r.salle_id =s.id AND s.etat != 'libre' ",nativeQuery=true)
	List<NameOnly> getData();
	
	@Query(value = "SELECT s.id FROM salle s , reservation r WHERE s.id = r.salle_id AND r.id = ?1", nativeQuery = true)
			Long findSalleByStatusReservation(Long i);
	
	public static interface NameOnly {
         int getId();
	     String getNom();
	     Date getDateNaissance();
	     String getMail();
	     String getStatus();
	     int getCapmin();
	     int getCapmax();
	     String getNomev();
	     int getPrix();
	     Date getHeuredep();
	     Date getHeurefin();
	     String getNomsal();
	     int getSurface();
	     String getAdress();
	     int getNbrpers();

	  }
	
}


