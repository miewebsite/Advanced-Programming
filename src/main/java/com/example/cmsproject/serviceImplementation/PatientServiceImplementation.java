package com.example.cmsproject.serviceImplementation;

import com.example.cmsproject.model.Patient;
import com.example.cmsproject.repository.PatientRepository;
import com.example.cmsproject.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("patientService")
public class PatientServiceImplementation implements PatientService {

    @Autowired
    private PatientRepository patientRepository;
    @Override
    public List<Patient> findAll() {
        return patientRepository.findAll();
    }

    @Override
    public Patient findById(Long id) {
        Optional<Patient> optionalPatient=patientRepository.findById(id);
        return optionalPatient.orElse(null);
    }

    @Override
    public void deleteById(Long id) {
    patientRepository.deleteById(id);
    }

    @Override
    public Patient save(Patient patient) {
        return patientRepository.save(patient);
    }
}

