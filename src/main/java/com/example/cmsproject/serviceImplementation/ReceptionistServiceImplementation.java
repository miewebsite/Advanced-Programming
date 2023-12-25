package com.example.cmsproject.serviceImplementation;


import com.example.cmsproject.model.Patient;
import com.example.cmsproject.model.Receptionist;
import com.example.cmsproject.repository.ReceptionistRepository;
import com.example.cmsproject.service.ReceptionistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("receptionistService")
public class ReceptionistServiceImplementation implements ReceptionistService {

    @Autowired
    private ReceptionistRepository receptionistRepository;

    @Override
    public List<Receptionist> findAll() {
        return receptionistRepository.findAll();
    }

    @Override
    public Receptionist findById(Long id) {
        Optional<Receptionist> receptionistOptional=receptionistRepository.findById(id);
        return receptionistOptional.orElse(null);
    }

    @Override
    public void deleteById(Long id) {
        receptionistRepository.deleteById(id);
    }

    @Override
    public Receptionist save(Receptionist receptionist) {
        return receptionistRepository.save(receptionist);
    }
}
