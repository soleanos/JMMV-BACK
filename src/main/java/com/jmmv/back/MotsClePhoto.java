package com.jmmv.back;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name= "motsclephoto")

public class MotsClePhoto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private long idMotsclephoto;
	private String idphoto;
	private String motcle;
	
	
	@ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "motClePhoto_Photo", 
             joinColumns = { @JoinColumn(name = "idMotsclephoto") }, 
             inverseJoinColumns = { @JoinColumn(name = "idPhoto") })
	
	private List<MotsClePhoto> motsCle ; 
	
	
	public MotsClePhoto(long idMotsclephoto, String idphoto, String motcle) {
		
		super();
		this.idMotsclephoto = idMotsclephoto;
		this.idphoto = idphoto;
		this.motcle = motcle;
	}
	
	public MotsClePhoto() {
	}

	public long getIdMotsclephoto() {
		return idMotsclephoto;
	}

	public void setIdMotsclephoto(long idMotsclephoto) {
		this.idMotsclephoto = idMotsclephoto;
	}

	public String getIdphoto() {
		return idphoto;
	}

	public void setIdphoto(String idphoto) {
		this.idphoto = idphoto;
	}

	public String getMotcle() {
		return motcle;
	}

	public void setMotcle(String motcle) {
		this.motcle = motcle;
	}
	
}