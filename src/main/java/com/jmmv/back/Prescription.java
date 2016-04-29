package com.jmmv.back;



import javax.persistence.*;

@Entity
@Table(name = "prescriptions")

public class Prescription {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private long idPrescription;
	private String specialite;
	private int posologie;
	private String renouvellement;
	private String vetoPharma;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="idAnimal")
	private Animal animal;
	
	public Prescription(long idPrescription, String specialite, int posologie, String renouvellement,
			String vetoPharma) {
		super();
		this.idPrescription = idPrescription;
		this.specialite = specialite;
		this.posologie = posologie;
		this.renouvellement = renouvellement;
		this.vetoPharma = vetoPharma;
	}

	public long getIdPrescription() {
		return idPrescription;
	}

	public void setIdPrescription(long idPrescription) {
		this.idPrescription = idPrescription;
	}

	public String getSpecialite() {
		return specialite;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}

	public int getPosologie() {
		return posologie;
	}

	public void setPosologie(int posologie) {
		this.posologie = posologie;
	}

	public String getRenouvellement() {
		return renouvellement;
	}

	public void setRenouvellement(String renouvellement) {
		this.renouvellement = renouvellement;
	}

	public String getVetoPharma() {
		return vetoPharma;
	}

	public void setVetoPharma(String vetoPharma) {
		this.vetoPharma = vetoPharma;
	}
	
	
	
	
}

