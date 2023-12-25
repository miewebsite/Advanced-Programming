package com.example.cmsproject.service;

import com.example.cmsproject.model.Patient;
import com.example.cmsproject.model.Receptionist;

import java.util.List;

public interface ReceptionistService {

    public abstract List<Receptionist> findAll();
    public abstract Receptionist findById(Long id);
    public abstract void deleteById(Long id);
    public abstract Receptionist save(Receptionist receptionist);
}
