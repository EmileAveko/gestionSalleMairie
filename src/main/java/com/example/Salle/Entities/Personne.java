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

//@Table(name="personne")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Personne  {

	@Id
    @GeneratedValue //(strategy =GenerationType.AUTO)
   // @Getter
    //@Setter
	protected Long id;
	//@Getter
	//@Setter
	protected String nom;
	//@Getter
	//@Setter
	protected String sexe;
	//@Getter
	//@Setter
	protected Date dateNaissance;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
		this.dateNaissance = dateNaissance;
	}
	
	/*
	
	public Personne() {}
	
	
	public Personne(Long ID, String nom, String sexe, Date dateNaissance) {
		
		this.ID = ID;
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
		this.dateNaissance = dateNaissance;
	}
	
	
	*/

	
}
