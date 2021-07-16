
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
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class,property="id")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity


//@Table(name="client")
public class Client extends Personne {
	  
	
	
	  private String contact;

      private String mail;
	
	  private String status;
      
	
	  @OneToMany(targetEntity = Reservation.class ,cascade = CascadeType.ALL)
	  @JoinColumn(name="client_id",referencedColumnName = "id")
      private List<Reservation> listreservation;



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


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public List<Reservation> getListreservation() {
		return listreservation;
	}


	public void setListreservation(List<Reservation> listreservation) {
		this.listreservation = listreservation;
	}
	  
	  
	
}
