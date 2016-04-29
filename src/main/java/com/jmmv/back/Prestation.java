package com.jmmv.back;

import java.util.Date;
import java.util.List;

import javax.persistence.*;


@Entity
@Table(name = "prestations")

public class Prestation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idPrestation;
	private String intervenant;
	private Date datePrestation;
	private String motif;
	private String notes;
	private int temperature;
	private String compteRendu;
	private String recommandations;
	
	public Prestation(long idPrestation, String intervenant, Date datePrestation, String motif, String notes,
			int temperature, String compteRendu, String recommandations) {
		super();
		this.idPrestation = idPrestation;
		this.intervenant = intervenant;
		this.datePrestation = datePrestation;
		this.motif = motif;
		this.notes = notes;
		this.temperature = temperature;
		this.compteRendu = compteRendu;
		this.recommandations = recommandations;
	}

	public long getIdPrestation() {
		return idPrestation;
	}

	public void setIdPrestation(long idPrestation) {
		this.idPrestation = idPrestation;
	}

	public String getIntervenant() {
		return intervenant;
	}

	public void setIntervenant(String intervenant) {
		this.intervenant = intervenant;
	}

	public Date getDatePrestation() {
		return datePrestation;
	}

	public void setDatePrestation(Date datePrestation) {
		this.datePrestation = datePrestation;
	}

	public String getMotif() {
		return motif;
	}

	public void setMotif(String motif) {
		this.motif = motif;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	public String getCompteRendu() {
		return compteRendu;
	}

	public void setCompteRendu(String compteRendu) {
		this.compteRendu = compteRendu;
	}

	public String getRecommandations() {
		return recommandations;
	}

	public void setRecommandations(String recommandations) {
		this.recommandations = recommandations;
	}
	
		
	
}