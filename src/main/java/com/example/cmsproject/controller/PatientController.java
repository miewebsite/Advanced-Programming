package com.example.cmsproject.controller;

import com.example.cmsproject.model.Patient;
import com.example.cmsproject.service.PatientService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class PatientController {
    private PatientService patientService;

    @RequestMapping(value = "/patient/new", method = RequestMethod.GET)
    public String patientRegForm(Model model){
        model.addAttribute("patient", new Patient());
        return "patient/new";
    }


    @RequestMapping(value = "/patient/new", method = RequestMethod.POST)
    public String registerNewPatient(Model model, Patient patient){
        patient= patientService.save(patient);
        model.addAttribute("patient", patient);
        return "redirect:/patient/list";
    }

    @RequestMapping(value = "/patient/list", method = RequestMethod.GET)
    public String findAllSuppliers(Model model){
        List<Patient> patients= patientService.findAll();
        model.addAttribute("patients", patients);
        return "patient/list";
    }

    @RequestMapping(value = "/patient/delete/{id}", method = RequestMethod.GET)
    public String deletePatientFromList(@PathVariable Long id){
        patientService.deleteById(id);
        return "redirect:/patient/list";
    }

    @RequestMapping(value = "/patient/edit/{id}", method = RequestMethod.GET)
    public String editPatient(Model model,@PathVariable Long id){
        Patient patient= patientService.findById(id);
        model.addAttribute("patient", patient);
        return "patient/edit";
    }

    @RequestMapping(value = "/patient/edit", method = RequestMethod.POST)
    public String editedPatientData(Patient patient){
        patientService.save(patient);
        return "redirect:/patient/list";
    }


}
