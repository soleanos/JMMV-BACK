package com.jmmv.back;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name="poids")

public class Poids {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private long id;

	//private long idAnimal;
	private Date date;
	private String intervenant;
	private double poids;
	private String commentaires;
	
	public Poids(long id, Date date,String intervenant, double poids, String commentaires) {
		
		super();
		this.id = id;
		this.date = date;
		this.intervenant = intervenant;
		this.poids = poids;
		this.commentaires = commentaires;
	}
	
	public Poids() {
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getIntervenant() {
		return intervenant;
	}
	public void setIntervenant(String intervenant) {
		this.intervenant = intervenant;
	}
	public double getPoids() {
		return poids;
	}
	public void setPoids(double poids) {
		this.poids = poids;
	}
	public String getCommentaires() {
		return commentaires;
	}
	public void setCommentaires(String commentaires) {
		this.commentaires = commentaires;
	}
	
	

}