 package com.jmmv.back;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name="vaccinations")

public class Vaccination {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private long idVaccination;
	
	private String intervenants;
	private Date datevacc;
	private String vaccin;
	private String notes;
	private String temperature;
	private Date consvacc;
	private String cerfa;
	private String type;
	private String labo;
	private String lot;
	private String cerfa1;
	private String intervenant1;
	private Date date1;
	private String type1;
	private String rappelchoix;
	private String rappel;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="idAnimal")
	private Animal animal;
	
	public Vaccination(long id, String intervenant, 
			Date datevacc, String vaccin, String notes, String temperature, 
			Date consvacc, String cerfa, String type,
			String labo, String lot, String cerfa1, 
			String intervenant1, Date date1, String type1, String rappelchoix,
	 String rappel) {
		super();
		this.idVaccination = id;
		this.datevacc = datevacc;
		this.vaccin = vaccin;
		this.notes = notes;
		this.temperature = temperature;
		this.consvacc = consvacc;
		this.cerfa = cerfa;
		this.type = type;
		this.labo = labo;
		this.lot = lot;
		this.cerfa1 = cerfa1;
		this.intervenant1 = intervenant1;
		this.date1 = date1;
		this.type1 = type1;
		this.rappelchoix = rappelchoix;
		this.rappel = rappel;
		
	}
	
	public Vaccination() {
	}

	public long getId() {
		return idVaccination;
	}

	public void setId(long id) {
		this.idVaccination = id;
	}

	public String getIntervenants() {
		return intervenants;
	}

	public void setIntervenants(String intervenants) {
		this.intervenants = intervenants;
	}

	public Date getDatevacc() {
		return datevacc;
	}

	public void setDatevacc(Date datevacc) {
		this.datevacc = datevacc;
	}

	public String getVaccin() {
		return vaccin;
	}

	public void setVaccin(String vaccin) {
		this.vaccin = vaccin;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getTemperature() {
		return temperature;
	}

	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

	public Date getConsvacc() {
		return consvacc;
	}

	public void setConsvacc(Date consvacc) {
		this.consvacc = consvacc;
	}

	public String getCerfa() {
		return cerfa;
	}

	public void setCerfa(String cerfa) {
		this.cerfa = cerfa;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLabo() {
		return labo;
	}

	public void setLabo(String labo) {
		this.labo = labo;
	}

	public String getLot() {
		return lot;
	}

	public void setLot(String lot) {
		this.lot = lot;
	}

	public String getCerfa1() {
		return cerfa1;
	}

	public void setCerfa1(String cerfa1) {
		this.cerfa1 = cerfa1;
	}

	public String getIntervenant1() {
		return intervenant1;
	}

	public void setIntervenant1(String intervenant1) {
		this.intervenant1 = intervenant1;
	}

	public Date getDate1() {
		return date1;
	}

	public void setDate1(Date date1) {
		this.date1 = date1;
	}

	public String getType1() {
		return type1;
	}

	public void setType1(String type1) {
		this.type1 = type1;
	}

	public String getRappelchoix() {
		return rappelchoix;
	}

	public void setRappelchoix(String rappelchoix) {
		this.rappelchoix = rappelchoix;
	}

	public String getRappel() {
		return rappel;
	}

	public void setRappel(String rappel) {
		this.rappel = rappel;
	}
	
}