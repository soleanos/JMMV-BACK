package com.jmmv.back;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name="poids")

public class Poid {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private long idPoid;

	private Date date;
	private String intervenant;
	private double poids;
	private String commentaires;
	
	public Poid(long id, Date date,String intervenant, double poids, String commentaires) {
		
		super();
		this.idPoid = id;
		this.date = date;
		this.intervenant = intervenant;
		this.poids = poids;
		this.commentaires = commentaires;
	}
	
	public Poid() {
	}
	
	
	public long getId() {
		return idPoid;
	}
	public void setId(long id) {
		this.idPoid = id;
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