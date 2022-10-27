package sn.estm.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.validation.constraints.NotEmpty;

@Entity
@Inheritance(strategy= InheritanceType.TABLE_PER_CLASS)
public abstract class Personne {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    protected Long id;
	@Column(length=50)
	//@NotEmpty(message="please fill out this field")
	protected String nom;
	@Column(length=50)
	//@NotEmpty(message="please fill out this field")
	protected String email;
    //@NotEmpty(message="please fill out this field")
	@Column(length=15)
	protected String motdepasse;
	//@NotEmpty(message="please fill out this field")
	protected Long tel;
 
	public Personne() {
		
	}
	public Personne(Long id,String nom, String email, String motdepasse, Long tel) {
		this.id = id;
	    this.nom = nom;
		this.email = email;
		this.motdepasse = motdepasse;
		this.tel = tel;
	}
	
    public abstract String getNom();
    public abstract void setNom(String nom);
    public abstract Long getId();
    public abstract void setId(Long id);
    public abstract String getEmail();
    public abstract void setEmail(String email);
    public abstract String getMotdepasse();
    public abstract void setMotdepasse(String motdepasse);
    public abstract Long getTel();
    public abstract void setTel(Long tel);
    
 
}
