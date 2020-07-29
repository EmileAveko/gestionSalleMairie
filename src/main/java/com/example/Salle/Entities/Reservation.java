package com.example.Salle.Entities;

import java.io.Serializable;
import java.util.Date;
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

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
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


//@Table(name="reservation")
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property="id")
public class Reservation {

	 @Id
	 @GeneratedValue // (strategy =GenerationType.AUTO)
	// @Getter
	 //@Setter
	private Long id;
	// @Getter
	 //@Setter
	private Date heuredep;
	// @Getter
	 //@Setter
	private Date heurefin;
	 //@Getter
	 //@Setter
	private String nomev;
	//private String etat;
	private int nbrpers;

	//@ManyToOne
    //@JsonIgnore
	//@JsonBackReference
//	private Client client;
	
	//@ManyToOne
	//@JsonBackReference
	//private Employe employe;
	
	//@ManyToOne 
	//private Salle salle;
	
	
	
	@OneToMany(targetEntity = ReservationEquipement.class ,cascade = CascadeType.ALL)
	  @JoinColumn(name="reservation_id",referencedColumnName = "id")
    
	private List<ReservationEquipement> listReservationEquipement;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getHeuredep() {
		return heuredep;
	}

	public void setHeuredep(Date heuredep) {
		this.heuredep = heuredep;
	}

	public Date getHeurefin() {
		return heurefin;
	}

	public void setHeurefin(Date heurefin) {
		this.heurefin = heurefin;
	}

	public String getNomev() {
		return nomev;
	}

	public void setNomev(String nomev) {
		this.nomev = nomev;
	}

	public List<ReservationEquipement> getListReservationEquipement() {
		return listReservationEquipement;
	}

	public void setListReservationEquipement(List<ReservationEquipement> listReservationEquipement) {
		this.listReservationEquipement = listReservationEquipement;
	}

	public int getNbrpers() {
		return nbrpers;
	}

	
	public void setNbrpers(int nbrpers) {
		this.nbrpers = nbrpers;
	}
	
/*	
	public Reservation() {}
	
	
	
	public Reservation(Long iD, Date heuredep, Date heurefin, String nomev,
			Set<ReservationEquipement> listReservationEquipement) {
		
		this.ID = iD;
		this.heuredep = heuredep;
		this.heurefin = heurefin;
		this.nomev = nomev;
		//this.client = client;
		this.employe = employe;
		//this.salle = salle;
		this.listReservationEquipement = listReservationEquipement;
	}



	public Long getID() {
		return ID;
	}
	public void setID(Long iD) {
		this.ID = iD;
	}
	public Date getHeuredep() {
		return heuredep;
	}
	public void setHeuredep(Date heuredep) {
		this.heuredep = heuredep;
	}
	public Date getHeurefin() {
		return heurefin;
	}
	public void setHeurefin(Date heurefin) {
		this.heurefin = heurefin;
	}
	public String getNomev() {
		return nomev;
	}
	public void setNomev(String nomev) {
		this.nomev = nomev;
	}


	public Client getClient() {
		return client;
	}


	public void setClient(Client client) {
		this.client = client;
	}

	public Employe getEmploye() {
		return employe;
	}


	public void setEmploye(Employe employe) {
		this.employe = employe;
	}


	public Salle getSalle() {
		return salle;
	}


	public void setSalle(Salle salle) {
		this.salle = salle;
	}


	public Set<ReservationEquipement> getListReservationEquipement() {
		return listReservationEquipement;
	}


	public void setListReservationEquipement(Set<ReservationEquipement> listReservationEquipement) {
		this.listReservationEquipement = listReservationEquipement;
	}
	
	*/
	
	       

}
