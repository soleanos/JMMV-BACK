package com.jmmv.back;

import java.util.Date;
import java.util.List;

import javax.persistence.*;


@Entity
@Table(name = "photos")

public class Photo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private long idPhoto;
	private Date datePhoto;
	private String intervenant;
	private String photo;
	private String titre;
	private String description;
	
	public Photo(long idPhoto, Date datePhoto, String intervenant, String photo, String titre, String description) {
		super();
		this.idPhoto = idPhoto;
		this.datePhoto = datePhoto;
		this.intervenant = intervenant;
		this.photo = photo;
		this.titre = titre;
		this.description = description;
	}

	public long getIdPhoto() {
		return idPhoto;
	}

	public void setIdPhoto(long idPhoto) {
		this.idPhoto = idPhoto;
	}

	public Date getDatePhoto() {
		return datePhoto;
	}

	public void setDatePhoto(Date datePhoto) {
		this.datePhoto = datePhoto;
	}

	public String getIntervenant() {
		return intervenant;
	}

	public void setIntervenant(String intervenant) {
		this.intervenant = intervenant;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
		
}