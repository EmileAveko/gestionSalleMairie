package com.example.Salle.Entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="salle")
public class Salle implements Serializable {
	
	@Id
	 @GeneratedValue (strategy =GenerationType.AUTO)
	private Long ID;
	private String nom;
	private String adresse;
	private int capmin;
	private int capmax;
	private int prix;
	
	@OneToMany(mappedBy="salle")
	private List<Gardien> listgardien;
	
	@OneToMany(mappedBy="salle")
	private List<Reservation> listreservation;
	
	@OneToMany(mappedBy="salle")
	private List<Equipement> listEquipements;
	
	public Salle() {}
	
	
	public Salle(Long ID, String nom, String adresse, int capmin, int capmax, int prix, List<Gardien> listgardien, List<Reservation> listreservation,List<Equipement> listEquipements) {
		
		this.ID = ID;
		this.nom = nom;
		this.adresse = adresse;
		this.capmin = capmin;
		this.capmax = capmax;
		this.prix = prix;
        this.listreservation=listreservation;
        this.listgardien=listgardien;
        this.listEquipements=listEquipements;
	}


	
	
	public Long getID() {
		return ID;
	}
	
	
	public void setID(Long ID) {
		this.ID = ID;
	}
	
	
	public String getNom() {
		return nom;
	}
	
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
	public String getAdresse() {
		return adresse;
	}
	
	
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	
	public int getCapmin() {
		return capmin;
	}
	
	
	public void setCapmin(int capmin) {
		this.capmin = capmin;
	}
	
	
	public int getCapmax() {
		return capmax;
	}
	
	
	public void setCapmax(int capmax) {
		this.capmax = capmax;
	}
	public int getPrix() {
		return prix;
	}
	
	
	public void setPrix(int prix) {
		this.prix = prix;
	}



	public List<Gardien> getListgardien() {
		return listgardien;
	}


	public void setListgardien(List<Gardien> listgardien) {
		this.listgardien = listgardien;
	}


	public List<Reservation> getListreservation() {
		return listreservation;
	}


	public void setListreservation(List<Reservation> listreservation) {
		this.listreservation = listreservation;
	}


	public List<Equipement> getListEquipements() {
		return listEquipements;
	}


	public void setListEquipements(List<Equipement> listEquipements) {
		this.listEquipements = listEquipements;
	}

		
	

}
