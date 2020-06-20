package com.example.Salle.Entities;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.example.Salle.Dto.AccueilData;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Getter
@Setter
//@Table(name="salle")
//@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class,property="id")
public class Salle  {
	
	@Id
	 @GeneratedValue //(strategy =GenerationType.AUTO)
	// @Getter
	 //@Setter
	private Long id;
	//@Getter
	//@Setter
	private String nomsal;
	//@Getter
	//@Setter
	private String adresse;
	//@Getter
	//@Setter
	private int capmin;
	//@Getter
	//@Setter
	private int capmax;
	//@Getter
	//@Setter
	private int prix;
	//@Getter
	//@Setter
	private String etat;
	
	//@OneToMany(mappedBy="salle")
	@OneToMany(targetEntity = Gardien.class ,cascade = CascadeType.ALL)
	  @JoinColumn(name="salle_id",referencedColumnName = "id")
    
	private List<Gardien> listgardien;
	
	//@OneToMany(mappedBy="salle")
	@OneToMany(targetEntity = Reservation.class ,cascade = CascadeType.ALL)
	  @JoinColumn(name="salle_id",referencedColumnName = "id")
    
	private List<Reservation> listreservation;
	
	//@OneToMany(mappedBy="salle")
	@OneToMany(targetEntity = Equipement.class ,cascade = CascadeType.ALL)
	  @JoinColumn(name="salle_id",referencedColumnName = "id")
    
	private List<Equipement> listEquipements;
	/*
	public Salle() {}
	
	
	public Salle(Long ID, String nom, String adresse, int capmin, int capmax, int prix,String etat, Set<Gardien> listgardien, Set<Reservation> listreservation,Set<Equipement> listEquipements) {
		
		this.ID = ID;
		this.nom = nom;
		this.adresse = adresse;
		this.capmin = capmin;
		this.capmax = capmax;
		this.prix = prix;
        this.listreservation=listreservation;
        this.listgardien=listgardien;
        this.listEquipements=listEquipements;
        this.etat=etat;
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



	public Set<Gardien> getListgardien() {
		return listgardien;
	}


	public void setListgardien(Set<Gardien> listgardien) {
		this.listgardien = listgardien;
	}
	

	public String getEtat() {
		return etat;
	}


	public void setEtat(String etat) {
		this.etat = etat;
	}


	public Set<Reservation> getListreservation() {
		return listreservation;
	}


	public void setListreservation(Set<Reservation> listreservation) {
		this.listreservation = listreservation;
	}


	public Set<Equipement> getListEquipements() {
		return listEquipements;
	}


	public void setListEquipements(Set<Equipement> listEquipements) {
		this.listEquipements = listEquipements;
	}

	
//	public List<AccueilData> getDataAccueil(){ return null;}
		
	*/

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomSal() {
		return nomsal;
	}

	public void setNomSal(String nomsal) {
		this.nomsal = nomsal;
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

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
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
