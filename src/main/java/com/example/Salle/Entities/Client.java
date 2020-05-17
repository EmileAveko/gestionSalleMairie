
package com.example.Salle.Entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;

@Entity
public class Client extends Personne implements Serializable {
	  
	
	 @GeneratedValue (strategy =GenerationType.AUTO)
	  private String contact;
      private String mail;
	
	  @OneToMany(mappedBy="client")
      private List<Reservation> listreservation;
	
	public Client() {}
	
	 
	public Client(String contact, String mail,List<Reservation> listreservation) {
		super();
		this.contact = contact;
		this.mail = mail;
		this.listreservation = listreservation;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}


	public List<Reservation> getListreservation() {
		return listreservation;
	}


	public void setListreservation(List<Reservation> listreservation) {
		this.listreservation = listreservation;
	}
	
	
	
}
