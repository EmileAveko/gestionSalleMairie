package com.example.Salle.Entities;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
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

//@Table(name="employe")
//@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class,property="id")
public class Employe extends Personne  {

	 //@GeneratedValue //(strategy =GenerationType.AUTO)
	//@Getter
	//@Setter
	private String mot_de_passe;
	
	//@Getter
	//@Setter
	private String poste;
	
	
	@OneToMany(targetEntity = Reservation.class ,cascade = CascadeType.ALL)
	  @JoinColumn(name="employe_id",referencedColumnName = "id")
    
	private List<Reservation> listreservation;


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


	public List<Reservation> getListreservation() {
		return listreservation;
	}


	public void setListreservation(List<Reservation> listreservation) {
		this.listreservation = listreservation;
	}
	
/*
	public Employe() {}
	
	public Employe(String mot_de_passe, String poste,Set<Reservation> listReservation) {
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
	
	public Set<Reservation> getListreservation() {
		return listreservation;
	}

	public void setListreservation(Set<Reservation> listreservation) {
		this.listreservation = listreservation;
	}

	
	*/
	
	
}
