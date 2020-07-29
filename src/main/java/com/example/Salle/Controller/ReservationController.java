package com.example.Salle.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.Salle.DAO.Reservation.ReservationRepository.NameOnly;
import com.example.Salle.Dto.AccueilData;
import com.example.Salle.Entities.Reservation;

import com.example.Salle.Service.ReservationService;


@RestController
public class ReservationController {
	@Autowired
	private ReservationService reservationservice;
	
	

	
	public ReservationController(ReservationService reservationservice) {
	
		this.reservationservice = reservationservice;
	}

	
	@RequestMapping(method = RequestMethod.GET,value="/reservations")
	public List<Reservation> getAllReservation(){
		return reservationservice.retrieveReservation();
		
	}
	
	
	@GetMapping("/reservations/{id}")
	public Reservation getReservation(@PathVariable Long id) {
		return reservationservice.getReservation(id);
	}
	
	
	@PostMapping("/reservation")
	public void addReservation(@RequestBody Reservation reservation) {
	  reservationservice.createReservation(reservation);	
	}
	
	
	
	@PutMapping("/reservationner")
	public void updateReservation(@RequestBody Reservation reservation) {
		reservationservice.updateReservation(reservation);
	}
	
	
	
   @DeleteMapping("reserver/{id}")
   public void deleteReservation(@PathVariable Long id)	
   {
	   reservationservice.deleteReservationEquipement(id);;
   }
   
   
   
	public ReservationService getReservationservice() {
		return reservationservice;
	}

	public void setResrvatiionservice(ReservationService reservationservice) {
		this.reservationservice = reservationservice;
	}
	
		@RequestMapping(method = RequestMethod.GET,value="/sallesacceuil")
	public List<NameOnly> getAccueilData(){
		return reservationservice.getit();
	}

}
