package com.jmmv.back;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name="ventealiments")

public class Ventealiments {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private long id;
	
	private String intervenant;
	private Date date;
	private String aliments;
	
	public Ventealiments(long id, String intervenant, Date date, String aliments) {
		
		super();
		this.id = id;
		this.intervenant = intervenant;
		this.date = date;
		this.aliments = aliments;
	}

	public Ventealiments() {
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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