package com.jmmv.back;

import java.sql.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="animaux")

public class Animal { 
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idAnimal;
	
	private String creation;
	private String nom;
	private String espece;
	private String race;
	private String couleur;
	private Date datedenaissance;
	private String certitude;
	private String sexe;
	private String sterilisation;
	private int numpuce;
	private int numtatouage;
	private String affixe;
	private String reproduction;
	private String notes;
	private Boolean decede;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idClient")
	private Client client;
	
	@OneToMany(mappedBy="animal")
    private List<Vaccination> vaccination;
	
	public Animal(long id, String creation, String nom, String espece, String couleur, Date datedenaissance,
			String certitude, String sexe, String sterilisation, int numpuce, int numtatouage, String affixe,
			String reproduction, String notes, boolean decede,Client client) {
		
		super();
		this.idAnimal = id;
		this.creation = creation;
		this.nom = nom;
		this.espece = espece;
		this.couleur = couleur;
		this.datedenaissance = datedenaissance;
		this.certitude = certitude;
		this.sexe = sexe;
		this.sterilisation = sterilisation;
		this.numpuce = numpuce;
		this.numtatouage = numtatouage;
		this.affixe = affixe;
		this.reproduction = reproduction;
		this.notes = notes;
		this.decede = decede;
		this.client = client;
	}
	
	public Animal(){}
	

	public long getIdAnimal() {
		return idAnimal;
	}

	public void setIdAnimal(long idAnimal) {
		this.idAnimal = idAnimal;
	}

	public String getCreation() {
		return creation;
	}

	public void setCreation(String creation) {
		this.creation = creation;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getEspece() {
		return espece;
	}

	public void setEspece(String espece) {
		this.espece = espece;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public Date getDatedenaissance() {
		return datedenaissance;
	}

	public void setDatedenaissance(Date datedenaissance) {
		this.datedenaissance = datedenaissance;
	}

	public String getCertitude() {
		return certitude;
	}

	public void setCertitude(String certitude) {
		this.certitude = certitude;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public String getSterilisation() {
		return sterilisation;
	}

	public void setSterilisation(String sterilisation) {
		this.sterilisation = sterilisation;
	}

	public int getNumpuce() {
		return numpuce;
	}

	public void setNumpuce(int numpuce) {
		this.numpuce = numpuce;
	}

	public int getNumtatouage() {
		return numtatouage;
	}

	public void setNumtatouage(int numtatouage) {
		this.numtatouage = numtatouage;
	}

	public String getAffixe() {
		return affixe;
	}

	public void setAffixe(String affixe) {
		this.affixe = affixe;
	}

	public String getReproduction() {
		return reproduction;
	}

	public void setReproduction(String reproduction) {
		this.reproduction = reproduction;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public Boolean getDecede() {
		return decede;
	}

	public void setDecede(Boolean decede) {
		this.decede = decede;
	}
	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	
	
	
}