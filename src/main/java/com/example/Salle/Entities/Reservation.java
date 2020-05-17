package com.example.Salle.Entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="reservation")
public class Reservation implements Serializable{

	@Id
	 @GeneratedValue (strategy =GenerationType.AUTO)
	private Long ID;
	private Date heuredep;
	private Date heurefin;
	private String nomev;

	@ManyToOne
	private Client client;
	
	@ManyToOne
	private Employe employe;
	
	@ManyToOne 
	private Salle salle;
	
	
	@OneToMany(mappedBy="reservation")
	private List<ReservationEquipement> listReservationEquipement;
	
	
	public Reservation() {}
	
	
	
	public Reservation(Long iD, Date heuredep, Date heurefin, String nomev, Client client, Employe employe, Salle salle,
			List<ReservationEquipement> listReservationEquipement) {
		super();
		ID = iD;
		this.heuredep = heuredep;
		this.heurefin = heurefin;
		this.nomev = nomev;
		this.client = client;
		this.employe = employe;
		this.salle = salle;
		this.listReservationEquipement = listReservationEquipement;
	}



	public Long getID() {
		return ID;
	}
	public void setID(Long iD) {
		ID = iD;
	}
	public Date getHeuredep() {
		return heuredep;
	}
	public void setHeuredep(Date heuredep) {
		this.heuredep = heuredep;
	}
	public Date getHeurefin() {
		return heurefin;
	}
	public void setHeurefin(Date heurefin) {
		this.heurefin = heurefin;
	}
	public String getNomev() {
		return nomev;
	}
	public void setNomev(String nomev) {
		this.nomev = nomev;
	}


	public Client getClient() {
		return client;
	}


	public void setClient(Client client) {
		this.client = client;
	}


	public Employe getEmploye() {
		return employe;
	}


	public void setEmploye(Employe employe) {
		this.employe = employe;
	}


	public Salle getSalle() {
		return salle;
	}


	public void setSalle(Salle salle) {
		this.salle = salle;
	}


	public List<ReservationEquipement> getListReservationEquipement() {
		return listReservationEquipement;
	}


	public void setListReservationEquipement(List<ReservationEquipement> listReservationEquipement) {
		this.listReservationEquipement = listReservationEquipement;
	}
	
	
	
	       

}
