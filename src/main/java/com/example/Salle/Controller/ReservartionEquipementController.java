package com.example.Salle.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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
import com.example.Salle.DAO.ReservationEquipement.ReservationEquipementRepository.NameOnce;
import com.example.Salle.Entities.ReservationEquipement;
import com.example.Salle.Service.ReservationEquipementService;

@RestController
@CrossOrigin(origins="*")
public class ReservartionEquipementController {

	@Autowired
	private ReservationEquipementService reservationEquipementService;
	
	

	
	public ReservartionEquipementController(ReservationEquipementService reservationequipementservice) {
	
		this.reservationEquipementService = reservationequipementservice;
	}

	
	@RequestMapping(method = RequestMethod.GET,value="/reservationsequipements")
	public List<ReservationEquipement> getAllClients(){
		return reservationEquipementService.retrieveReservationEquipement();
		
	}
	
	
	@GetMapping("/reservationsequipements/{id}")
	public ReservationEquipement getReservationEquipement(@PathVariable Long id) {
		return reservationEquipementService.getReservationEquipement(id);
	}
	
	
	@PostMapping("/reservationequipement")
	public void addReservationEquipement(@RequestBody ReservationEquipement reservationEquipement) {
	  reservationEquipementService.createReservationEquipement(reservationEquipement);	
	}
	
	
	
	@PutMapping("/reservationnerequipement")
	public void updateReservationEquipement(@RequestBody ReservationEquipement reservationEquipement) {
		reservationEquipementService.updateReservationEquipement( reservationEquipement);
	}
	
	
	
   @DeleteMapping("reserverequipement/{id}")
   public void deleteReservationEquipement(@PathVariable Long id)	
   {
	   reservationEquipementService.deleteReservationEquipement(id);
   }


public ReservationEquipementService getReservationEquipementService() {
	return reservationEquipementService;
}


public void setReservationEquipementService(ReservationEquipementService reservationEquipementService) {
	this.reservationEquipementService = reservationEquipementService;
}
   
   

@RequestMapping(method = RequestMethod.GET,value="/equipementreserver")
public List<NameOnce> getAccueilData(){
return reservationEquipementService.findIt();
}

	

}
