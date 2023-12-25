package com.example.cmsproject.repository;

import com.example.cmsproject.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("patientRepository")
public interface PatientRepository extends JpaRepository<Patient, Long> {

}
