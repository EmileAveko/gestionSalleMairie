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
	 //@Setter
	private String nomPhoto;
	
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

	public String getNomPhoto() {
		return nomPhoto;
	}

	public void setNomPhoto(String nomPhoto) {
		this.nomPhoto = nomPhoto;
	}

	public Set<ReservationEquipement> getReservationequipement() {
		return reservationequipement;
	}

	public void setReservationequipement(Set<ReservationEquipement> reservationequipement) {
		this.reservationequipement = reservationequipement;
	}
    
  
    /*
    public Equipement() {}
	
	
	
	
	
	public Equipement(Long ID, String nom, float prix,String nomPhoto, Salle salle, Employe employe, Set<ReservationEquipement> reservationequipement) {
		
		this.ID = ID;
		this.nom = nom;
		this.prix = prix;
		this.nomPhoto = nomPhoto;
		this.salle = salle;
		this.employe = employe;
		this.reservationequipement = reservationequipement;
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
	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}
	public String getNomPhoto() {
		return nomPhoto;
	}
	public void setNomPhoto(String nomPhoto) {
		this.nomPhoto = nomPhoto;
	}





	public Set<ReservationEquipement> getReservationequipement() {
		return reservationequipement;
	}





	public void setReservationequipement(Set<ReservationEquipement> reservationequipement) {
		this.reservationequipement = reservationequipement;
	}





	public Salle getSalle() {
		return salle;
	}





	public void setSalle(Salle salle) {
		this.salle = salle;
	}





	public Employe getEmploye() {
		return employe;
	}





	public void setEmploye(Employe employe) {
		this.employe = employe;
	}
	
	
	*/
    
    
}
