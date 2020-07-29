package com.example.Salle.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Getter
public class ImageEquipement {
	@Id
	@GeneratedValue
	 private Long id;
	
	 private String nomPhoto ;
	 private String type ;
	 @Lob
	 private byte[] photo;
	 
	 
	 
	 
	public ImageEquipement(String nomPhoto, String type, byte[] photo) {
		this.nomPhoto = nomPhoto;
		this.type = type;
		this.photo = photo;
	}
	
	
	public ImageEquipement() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomPhoto() {
		return nomPhoto;
	}
	public void setNomphoto(String nomPhoto) {
		this.nomPhoto = nomPhoto;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public byte[] getPhoto() {
		return photo;
	}
	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}


		

}
