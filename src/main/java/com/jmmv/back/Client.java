package com.jmmv.back;

import java.util.Date;
import java.util.List;

import javax.persistence.*;


@Entity
@Table(name = "clients")

public class Client {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
    private  long idClient;
	private  String civilite;
    private  String nom;
    private  String prenom;
    private  String adresse;
    private  String telephone;
    private  Boolean listeRouge;
    private  String fax;
    private  String email;
    private  String cp;
    private  Date creation;
    private  List<Date> relancesVaccin;
    private  List<Date> relancesEMail;
    private  Client clientRefere;
    private  Client clientReferant;
    
    @OneToMany(mappedBy="client")
    private List<Animal> animaux;

	public Client(long idClient, String civilite, String nom, String prenom, String adresse, String telephone,
			Boolean listeRouge, String fax, String email, String cp, Date creation, List<Date> relancesVaccin,
			List<Date> relancesEMail, Client clientRefere, Client clientReferant, List<Animal> animaux) {
		super();
		this.idClient = idClient;
		this.civilite = civilite;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.telephone = telephone;
		this.listeRouge = listeRouge;
		this.fax = fax;
		this.email = email;
		this.cp = cp;
		this.creation = creation;
		this.relancesVaccin = relancesVaccin;
		this.relancesEMail = relancesEMail;
		this.clientRefere = clientRefere;
		this.clientReferant = clientReferant;
		this.animaux = animaux;
	}

	public Client() {
	}
    
	public String getCivilite() {
		return civilite;
	}
	public void setCivilite(String civilite) {
		this.civilite = civilite;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCp() {
		return cp;
	}
	public void setCp(String cp) {
		this.cp = cp;
	}
	
	public long getIdClient() {
		return idClient;
	}
	
	public void setIdClient(long idClient) {
		this.idClient = idClient;
	}
	
	public Boolean getListeRouge() {
		return listeRouge;
	}
	
	public void setListeRouge(Boolean listeRouge) {
		this.listeRouge = listeRouge;
	}
	
	public Date getCreation() {
		return creation;
	}
	
	public void setCreation(Date creation) {
		this.creation = creation;
	}
	
	public List<Date> getRelancesVaccin() {
		return relancesVaccin;
	}
	
	public void setRelancesVaccin(List<Date> relancesVaccin) {
		this.relancesVaccin = relancesVaccin;
	}
	
	public List<Date> getRelancesEMail() {
		return relancesEMail;
	}
	
	public void setRelancesEMail(List<Date> relancesEMail) {
		this.relancesEMail = relancesEMail;
	}
	
	public Client getClientRefere() {
		return clientRefere;
	}
	
	public void setClientRefere(Client clientRefere) {
		this.clientRefere = clientRefere;
	}
	
	public Client getClientReferant() {
		return clientReferant;
	}
	
	public void setClientReferant(Client clientReferant) {
		this.clientReferant = clientReferant;
	}
	
	public List<Animal> getAnimaux() {
		return animaux;
	}
	
	public void setAnimaux(List<Animal> animaux) {
		this.animaux = animaux;
	}
	

}