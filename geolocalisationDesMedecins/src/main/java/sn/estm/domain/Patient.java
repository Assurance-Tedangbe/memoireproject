package sn.estm.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="patients")
public class Patient extends Personne {

	@ManyToMany
	            @JoinTable(
		        name = "patients_medecins", 
		        joinColumns = { @JoinColumn(name = "patient_id") }, 
		        inverseJoinColumns = { @JoinColumn(name = "medecin_id") } )
	  
	  private List<Medecin> listemedecins;
    private String nom;
	  
	  public Patient() {
		  listemedecins = new ArrayList<Medecin>();	
	  }
	  
	  public Patient(Long id, String nom, String email, String motdepasse, Long tel) {
			super(id, nom, email, motdepasse, tel);
		}
	  
	/*  public void assignerPatientsAuxMedecins(Medecin medecin)
	  {
	        listemedecins.add(medecin);	
	  }*/

	public List<Medecin> getListemedecins() {
		return listemedecins;
	}

	public void setListemedecins(List<Medecin> listemedecins) {
		this.listemedecins = listemedecins;
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
