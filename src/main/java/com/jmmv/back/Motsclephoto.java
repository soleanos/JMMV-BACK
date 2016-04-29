package com.jmmv.back;

//import java.util.List;

import javax.persistence.*;

@Entity
@Table(name= "motsclephoto")

public class Motsclephoto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private long idMotsclephoto;
	private String idphoto;
	private String motcle;
	
	//@ManyToMany(mappedBy="photo")
	//private List<Photo> photo;
	
	
	public Motsclephoto(long idMotsclephoto, String idphoto, String motcle) {
		
		super();
		this.idMotsclephoto = idMotsclephoto;
		this.idphoto = idphoto;
		this.motcle = motcle;
	}
	
	public Motsclephoto() {
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