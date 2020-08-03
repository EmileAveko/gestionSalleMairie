package com.example.Salle.DAO.Reservation;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.Salle.Entities.Reservation;


public interface ReservationRepository extends JpaRepository<Reservation,Long>{
	
	@Query(value=" Select c.nom, c.date_naissance, c.mail, c.status ,s.adresse ,s.capmin ,s.surface ,s.capmax, s.adress ,r.nomev,s.prix,r.heuredep,r.heurefin,s.nomsal   from client c, salle s , reservation r WHERE c.id =r.client_id AND r.salle_id =s.id ",nativeQuery=true)
	List<NameOnly> getData();
	
	
	
	public static interface NameOnly {

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
	     String getNomSal();
	     int getSurface();
	     String getAdress();
	     

	  }
	
}


/*@Query(value= "select new com.example.Salle.Dto.AccueilData(java.lang.String(nom)) from Client ",nativeQuery = false)
public List<AccueilData> getDataAccueil();
*/
 
// "select new com.example.Salle.Dto.AccueilData( java.lang.String(c.nom), java.util.Date(c.dateNaissance), java.lang.String(c.mail), java.lang.String(c.status) ,java.lang.String(s.adresse) ,int(s.capmin) ,int(s.capmax) ,java.lang.String(r.nomev),int(s.prix),java.util.Date(r.heuredep),java.util.Date(r.heurefin)  ) from Client c, Salle s JOIN c.listreservation r 