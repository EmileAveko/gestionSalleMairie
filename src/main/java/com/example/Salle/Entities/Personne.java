package com.example.Salle.Entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;


@Entity
@Table(name="personne")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Personne implements Serializable {

	@Id
    @GeneratedValue (strategy =GenerationType.AUTO)
	protected Long ID;
	protected String nom;
	protected String sexe;
	protected Date dateNaissance;
	
	
	public Personne() {}
	
	
	public Personne(Long ID, String nom, String sexe, Date dateNaissance) {
		
		ID = ID;
		this.nom = nom;
		this.sexe = sexe;
		this.dateNaissance = dateNaissance;
	}
	
	
	public Long getID() {
		return ID;
	}
	public void setID(Long iD) {
		ID = iD;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		dateNaissance = dateNaissance;
	}
	
	
	

}
