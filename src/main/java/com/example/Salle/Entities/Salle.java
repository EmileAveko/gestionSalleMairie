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
	private String adress;
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
	
	private int surface ;
	//@OneToMany(mappedBy="salle")
	@OneToMany(targetEntity = Gardien.class ,cascade = CascadeType.ALL)
	  @JoinColumn(name="salle_id",referencedColumnName = "id")
    
	private List<Gardien> listgardien;
	
	//@OneToMany(mappedBy="salle")
	@OneToMany(targetEntity = Reservation.class ,cascade = CascadeType.ALL)
	  @JoinColumn(name="salle_id",referencedColumnName = "id")
    
	private List<Reservation> listReservations;
	
	//@OneToMany(mappedBy="salle")
	@OneToMany(targetEntity = Equipement.class ,cascade = CascadeType.ALL)
	  @JoinColumn(name="salle_id",referencedColumnName = "id")
    
	private List<Equipement> listEquipements;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomsal() {
		return nomsal;
	}

	public void setNomsal(String nomsal) {
		this.nomsal = nomsal;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
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

	public List<Reservation> getListReservations() {
		return listReservations;
	}

	public void setListreservation(List<Reservation> listReservations) {
		this.listReservations = listReservations;
	}

	public List<Equipement> getListEquipements() {
		return listEquipements;
	}

	public void setListEquipements(List<Equipement> listEquipements) {
		this.listEquipements = listEquipements;
	}

	public int getSurface() {
		return surface;
	}

	public void setSurface(int surface) {
		this.surface = surface;
	}
	
   
}
