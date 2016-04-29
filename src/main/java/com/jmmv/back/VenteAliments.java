package com.jmmv.back;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name="venteAliments")

public class VenteAliments {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private long idVenteAliments;
	
	private String intervenant;
	private Date date;
	private String aliments;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="idAnimal")
	private Animal animal;
	
	public VenteAliments(long id, String intervenant, Date date, String aliments) {
		
		super();
		this.idVenteAliments = id;
		this.intervenant = intervenant;
		this.date = date;
		this.aliments = aliments;
	}

	public VenteAliments() {
	}
	
	public long getId() {
		return idVenteAliments;
	}

	public void setId(long id) {
		this.idVenteAliments = id;
	}

	public String getIntervenant() {
		return intervenant;
	}

	public void setIntervenant(String intervenant) {
		this.intervenant = intervenant;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getAliments() {
		return aliments;
	}

	public void setAliments(String aliments) {
		this.aliments = aliments;
	}
	
	
	
	
	
	
}