package com.example.Salle.Dto;

import java.util.Date;

import java.util.Set;

import com.example.Salle.Entities.Equipement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class AccueilData{
//	
//	private Long idres;
	private String nom;
//	private String dateNaissance;
//	private String mail;
//	private String status;
//	private String adresse;
//	private int capmin;
//	private int capmax;
//	private String nomev;
//	private int prix;
//    private Date heuredep;
//	private Date heurefin;
//	
	
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
//	public String getDateNaissance() {
//		return dateNaissance;
//	}
//	public void setDateNaissance(String dateNaissance) {
//		this.dateNaissance = dateNaissance;
//	}
//	public String getMail() {
//		return mail;
//	}
//	public void setMail(String mail) {
//		this.mail = mail;
//	}
//	public String getStatus() {
//		return status;
//	}
//	public void setStatus(String status) {
//		this.status = status;
//	}
//	public String getAdresse() {
//		return adresse;
//	}
//	public void setAdresse(String adresse) {
//		this.adresse = adresse;
//	}
//	public int getCapmin() {
//		return capmin;
//	}
//	public void setCapmin(int capmin) {
//		this.capmin = capmin;
//	}
//	public int getCapmax() {
//		return capmax;
//	}
//	public void setCapmax(int capmax) {
//		this.capmax = capmax;
//	}
//	public String getNomev() {
//		return nomev;
//	}
//	public void setNomev(String nomev) {
//		this.nomev = nomev;
//	}
//	public int getPrix() {
//		return prix;
//	}
//	public void setPrix(int prix) {
//		this.prix = prix;
//	}
//	public Date getHeuredep() {
//		return heuredep;
//	}
//	public void setHeuredep(Date heuredep) {
//		this.heuredep = heuredep;
//	}
//	public Date getHeurefin() {
//		return heurefin;
//	}
//	public void setHeurefin(Date heurefin) {
//		this.heurefin = heurefin;
//	}
//	
	
	//private Set<Equipement> listEquipements;
	
	
}
