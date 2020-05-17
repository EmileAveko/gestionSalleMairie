package com.example.Salle.Entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="employe")
public class Employe extends Personne implements Serializable {

	 @GeneratedValue (strategy =GenerationType.AUTO)
	
	private String mot_de_passe;
	private String poste;
	
	@OneToMany(mappedBy="employe")
	private List<Reservation> listreservation;
	

	public Employe() {}
	
	public Employe(String mot_de_passe, String poste,List<Reservation> listReservation) {
		super();
		this.mot_de_passe = mot_de_passe;
		this.poste = poste;
		this.listreservation=listReservation;
	
	}
	
	
	
	public String getMot_de_passe() {
		return mot_de_passe;
	}
	
	
	public void setMot_de_passe(String mot_de_passe) {
		this.mot_de_passe = mot_de_passe;
	}
	
	public List<Reservation> getListreservation() {
		return listreservation;
	}

	public void setListreservation(List<Reservation> listreservation) {
		this.listreservation = listreservation;
	}

	
	
	
}
