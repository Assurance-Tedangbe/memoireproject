package sn.estm.metier;

import java.util.List;

import sn.estm.domain.*;

public interface MedecinService {

    List<Medecin> getAllMedecins();
    void addMedecin(Medecin medecin);
    void setMedecin(Medecin medecin);
    Medecin getMedecin(Long idmedecin);
    void deleteMedecin(Long idmedecin);
}
