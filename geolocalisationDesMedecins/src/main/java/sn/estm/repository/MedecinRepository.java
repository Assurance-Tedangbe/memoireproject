package sn.estm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sn.estm.domain.Medecin;

@Repository
public interface MedecinRepository extends JpaRepository<Medecin,Long> {

}
