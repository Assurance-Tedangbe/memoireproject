package sn.estm.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="medecins")
public class Medecin extends Personne {

	@Column(length=50)
	private String specialite;
	
@ManyToMany(mappedBy="listemedecins",cascade=CascadeType.ALL)
	
	private List<Patient> listepatients;

	public Medecin() {
		listepatients= new ArrayList<Patient>();
	}
	

	public Medecin(Long id, String nom, String email, String motdepasse, Long tel, String specialite) {
		super(id,nom, email, motdepasse, tel);
		this.specialite= specialite;
				}
	
	/* public void assignerMedecinAuxPatients(Patient patient)
	  {
		  listepatients.add(patient);
	  }*/

	public String getSpecialite() {
		return specialite;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}

	public List<Patient> getListepatients() {
		return listepatients;
	}

	public void setListepatients(List<Patient> listepatients) {
		this.listepatients = listepatients;
	}

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;        
    }

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public void setNom(String nom) {
        this.nom = nom;
        
    }
    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
        
    }

    @Override
    public String getMotdepasse() {
        return motdepasse;
    }

    @Override
    public void setMotdepasse(String motdepasse) {
        this.motdepasse = motdepasse;
        
    }

    @Override
    public Long getTel() {
        return tel;
    }

    @Override
    public void setTel(Long tel) {
        this.tel = tel; 
    }

 
	 
}
