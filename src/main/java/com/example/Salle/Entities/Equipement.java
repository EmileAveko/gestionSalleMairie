package com.example.Salle.Entities;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
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

//@Table(name="equipement")
//@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class,property="id")
public class Equipement {

	 @Id
	 @GeneratedValue  //(strategy =GenerationType.AUTO)
	// @Getter
	// @Setter
	private Long id ;
	// @Getter
	 //@Setter
	private String nom;
	// @Getter
	 //@Setter
	private float prix;
	 //@Getter
	
	@OneToMany(targetEntity = ImageEquipement.class ,cascade = CascadeType.ALL)
	  @JoinColumn(name="equipemnt_id",referencedColumnName = "id")
	private Set<ImageEquipement> listImageEquipement;
	/*
    @ManyToOne
	private Salle salle;
	
    @ManyToOne
	private Employe employe;
    */
    //@OneToMany(mappedBy="equipement")
    @OneToMany(targetEntity = ReservationEquipement.class ,cascade = CascadeType.ALL)
	  @JoinColumn(name="equipement_id",referencedColumnName = "id")
    
    private Set<ReservationEquipement> reservationequipement;

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

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	
	

	public Set<ReservationEquipement> getReservationequipement() {
		return reservationequipement;
	}

	public void setReservationequipement(Set<ReservationEquipement> reservationequipement) {
		this.reservationequipement = reservationequipement;
	}

	public Set<ImageEquipement> getListImageEquipement() {
		return listImageEquipement;
	}

	public void setListImageEquipement(Set<ImageEquipement> listImageEquipement) {
		this.listImageEquipement = listImageEquipement;
	}
	
	
	
  
    
}
