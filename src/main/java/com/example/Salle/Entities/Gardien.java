package com.example.Salle.Entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
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

//@Table(name="gardien")
//@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class,property="id")
public class Gardien extends Personne {
	//@Getter
	//@Setter
	private String mot_de_passe;
	//@Getter
	//@Setter
	private String poste;
	/*
	@ManyToOne
	private Salle salle;
	*/
	public String getMot_de_passe() {
		return mot_de_passe;
	}
	public void setMot_de_passe(String mot_de_passe) {
		this.mot_de_passe = mot_de_passe;
	}
	public String getPoste() {
		return poste;
	}
	public void setPoste(String poste) {
		this.poste = poste;
	}
	
	/*
	
	public Gardien() {}
	

	public Gardien(String mot_de_passe, String poste, Salle salle) {
		super();
		this.mot_de_passe = mot_de_passe;
		this.poste = poste;
		this.salle = salle;
	}

	public String getMot_de_passe() {
		return mot_de_passe;
	}

	public void setMot_de_passe(String mot_de_passe) {
		this.mot_de_passe = mot_de_passe;
	}

	public String getPoste() {
		return poste;
	}

	public void setPoste(String poste) {
		this.poste = poste;
	}

	public Salle getsalle() {
		return salle;
	}

	public void setsalle(Salle salle) {
		this.salle = salle;
	}
	
	*/
	

}
