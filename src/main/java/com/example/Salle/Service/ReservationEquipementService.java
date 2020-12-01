package com.example.Salle.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Salle.DAO.Reservation.ReservationRepository.NameOnly;
import com.example.Salle.DAO.ReservationEquipement.*;
import com.example.Salle.DAO.ReservationEquipement.ReservationEquipementRepository.NameOnce;
import com.example.Salle.Entities.ReservationEquipement;

@Service
public class ReservationEquipementService{
	
	@Autowired
	private ReservationEquipementRepository reservationequipementRepo;

	public ReservationEquipementService(ReservationEquipementRepository reservationequipementRepo) {
		this.reservationequipementRepo = reservationequipementRepo;
	}
	
	public ReservationEquipement createReservationEquipement(ReservationEquipement reservationequipement) {
		return reservationequipementRepo.save(reservationequipement);
	}

	public List<ReservationEquipement> createEquipements(List<ReservationEquipement> listreservationequipement)
	{
		return reservationequipementRepo.saveAll(listreservationequipement);
	}
	
	public ReservationEquipement updateReservationEquipement(ReservationEquipement reservationequipement) {
		
		ReservationEquipement existingreservationequipement= reservationequipementRepo.findById(reservationequipement.getId()).orElse(null);
		//existingreservationequipement.setEquipement(reservationequipement.getEquipement());
		//existingreservationequipement.setReservation(reservationequipement.getReservation());
		//existingreservationequipement.setId(reservationequipement.getId());
		return reservationequipementRepo.save(existingreservationequipement);
		
	}
	
	public void deleteReservationEquipement(Long id) {
		 reservationequipementRepo.deleteById(id);
	}
	
	public ReservationEquipement getReservationEquipement(Long id) {
		return reservationequipementRepo.findById(id).orElse(null);
	}
	
	public List<ReservationEquipement> retrieveReservationEquipement(){
	  /*	List<ReservationEquipement> listreservationequipement= new ArrayList<ReservationEquipement>();
		reservationequipementRepo.findAll().forEach(listreservationequipement::add);
		return listreservationequipement;*/
		return reservationequipementRepo.findAll();

	
}

	public List<NameOnce> findIt(){
		return reservationequipementRepo.getData();
	}
	
	
	
}