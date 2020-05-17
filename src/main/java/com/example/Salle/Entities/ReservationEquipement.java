package com.example.Salle.Entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="reservationEquipement")
public class ReservationEquipement implements Serializable {
	
	@Id
	 @GeneratedValue (strategy =GenerationType.AUTO)
	private Long ID;
	
	@ManyToOne
	private Reservation reservation;
	
	@ManyToOne
	private Equipement equipement;
	
	public ReservationEquipement() {}

	
	
	public ReservationEquipement(Long ID, Reservation reservation, Equipement equipement) {
		
		this.ID = ID;
		this.reservation = reservation;
		this.equipement = equipement;
	}



	public Long getID() {
		return ID;
	}

	public void setID(Long iD) {
		ID = iD;
	}

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

	public Equipement getEquipement() {
		return equipement;
	}

	public void setEquipement(Equipement equipement) {
		this.equipement = equipement;
	}
	

	
	

}
