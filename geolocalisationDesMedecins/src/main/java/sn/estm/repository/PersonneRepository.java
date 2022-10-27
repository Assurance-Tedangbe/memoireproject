package sn.estm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sn.estm.domain.Personne;

@Repository
public interface PersonneRepository extends JpaRepository<Personne,Long> {

}
