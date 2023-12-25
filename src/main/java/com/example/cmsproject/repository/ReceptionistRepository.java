package com.example.cmsproject.repository;

import com.example.cmsproject.model.Receptionist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("receptionistRepository")
public interface ReceptionistRepository extends JpaRepository<Receptionist, Long> {

}
