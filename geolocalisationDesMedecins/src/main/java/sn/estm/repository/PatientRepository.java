package sn.estm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sn.estm.domain.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient,Long>{

}
