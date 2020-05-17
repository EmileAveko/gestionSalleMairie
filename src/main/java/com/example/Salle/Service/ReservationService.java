package com.example.Salle.Service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Salle.DAO.Reservation.*;
import com.example.Salle.Entities.*; 



@Service
public class ReservationService {

	@Autowired
	private ReservationRepository reservationRepo;

	public ReservationService(ReservationRepository reservationRepo) {
		
		this.reservationRepo = reservationRepo;
	}

	public Reservation createReservation(Reservation reservation) {
		return reservationRepo.save(reservation);
	}

	public List<Reservation> createReservations(List<Reservation> listreservation)
	{
		return reservationRepo.saveAll(listreservation);
	}
	
	public Reservation updateReservation(Reservation reservation) {
		
		Reservation existingreservation= reservationRepo.findById(reservation.getID()).orElse(null);
		existingreservation.setClient(reservation.getClient());
		existingreservation.setEmploye(reservation.getEmploye());
		existingreservation.setHeuredep(reservation.getHeuredep());
		existingreservation.setHeurefin(reservation.getHeurefin());
		existingreservation.setListReservationEquipement(reservation.getListReservationEquipement());
		existingreservation.setNomev(reservation.getNomev());
		existingreservation.setSalle(reservation.getSalle());
		return reservationRepo.save(existingreservation);
	}
	
	public void deleteReservationEquipement(Long id) {
		 reservationRepo.deleteById(id);
	}
	
	public Reservation getReservation(Long id) {
		return reservationRepo.findById(id).orElse(null);
	}
	
	public List<Reservation> retrieveReservation(){
		List<Reservation> listreservation= new ArrayList<Reservation>();
		reservationRepo.findAll().forEach(listreservation::add);
		return listreservation;

	
}
	
	
}
