package com.jmmv.back;

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
    private  String fax;
    private  String email;
    private  String cp;
    
    @OneToMany(mappedBy="client")
    private List<Animal> animaux;
    
    
    public Client(long id, String civilite, String nom, String prenom, String adresse, String telephone, String fax,
			String email, String cp) {
		super();
		this.idClient = id;
		this.civilite = civilite;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.telephone = telephone;
		this.fax = fax;
		this.email = email;
		this.cp = cp;
	}
    
    public Client() {
	}
    
	public long getId() {
		return  idClient;
	}
	public void setId(long id) {
		this.idClient = id;
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
	

}