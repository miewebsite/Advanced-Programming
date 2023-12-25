package com.example.cmsproject.service;

import com.example.cmsproject.model.Patient;

import java.util.List;

public interface PatientService {
    public abstract List<Patient> findAll();
    public abstract Patient findById(Long id);
    public abstract void deleteById(Long id);
    public abstract Patient save(Patient patient);
}
