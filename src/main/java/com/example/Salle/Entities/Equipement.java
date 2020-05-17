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
@Table(name="equipement")
public class Equipement implements Serializable {

	 @Id
	 @GeneratedValue (strategy =GenerationType.AUTO)
	private Long ID ;
	private String nom;
	private float prix;
	private byte[]nomPhoto;
	
    @ManyToOne
	private Salle salle;
	
    @ManyToOne
	private Employe employe;
    
    @OneToMany(mappedBy="equipement")
    private List<ReservationEquipement> reservationequipement;
    
    public Equipement() {}
	
	
	
	
	
	public Equipement(Long ID, String nom, float prix, byte[] nomPhoto, Salle salle, Employe employe, List<ReservationEquipement> reservationequipement) {
		super();
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
	public byte[] getNomPhoto() {
		return nomPhoto;
	}
	public void setNomPhoto(byte[] nomPhoto) {
		this.nomPhoto = nomPhoto;
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
	
	

}
