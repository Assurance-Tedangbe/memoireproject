package sn.estm.metier;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sn.estm.domain.*;
import sn.estm.repository.*;

@Service
public class MedecinServiceImpl implements MedecinService {

    @Autowired
    private PersonneRepository personneRepo;
    
    @Autowired
    private MedecinRepository medecinRepo;
    
    @Autowired
    private PatientRepository patientRepo;
    
    @Override
    public  List<Medecin> getAllMedecins(){
        List<Medecin> list = medecinRepo.findAll();
        return list;
    }

    @Override
    public void addMedecin(Medecin medecin) {
        personneRepo.save(medecin);
        
    }

    @Override
    public void setMedecin(Medecin medecin) {
        personneRepo.save(medecin);
        
    }

    @Override
    public Medecin getMedecin(Long idmedecin) {
        Medecin medecin=null;
        Optional <Medecin> optional= medecinRepo.findById(idmedecin);
        if(optional.isPresent())
        {
            medecin=optional.get();
        }
        else
        {
            throw new RuntimeException("Cet médecin n'existe pas" +idmedecin);
        }
        return medecin;
    }

    @Override
    public void deleteMedecin(Long idmedecin) {
        medecinRepo.deleteById(idmedecin);
        
    }
}
	
	/*
	
	//addMedecin
	public void ajouterMedecin(Medecin medecin) {
		personneRepo.save(medecin);
	}
	
	public void modifierMedecin(Medecin medecin)
	{
		personneRepo.save(medecin);
	}
	
	//getMedecinById
	public Medecin rechercherMedecin(Long idmedecin) {
		Medecin medecin=null;
		Optional <Medecin> optional= medecinRepo.findById(idmedecin);
		if(optional.isPresent())
		{
			medecin=optional.get();
		}
		return medecin;
	}
	//getallMedecins
	public List<Medecin> listeMedecin(){
	    List<Medecin> list = medecinRepo.findAll();
	    return list;
	}
	//deleteMedecinById
	public void supprimerMedecin(Long idmedecin) {
	    medecinRepo.deleteById(idmedecin);
	}*/


