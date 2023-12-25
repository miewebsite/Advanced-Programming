package com.example.cmsproject.controller;


import com.example.cmsproject.model.Patient;
import com.example.cmsproject.model.Receptionist;
import com.example.cmsproject.service.ReceptionistService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class ReceptionistController {

    private ReceptionistService receptionistService;
    @RequestMapping(value = "/receptionist/new", method = RequestMethod.GET)
    public String receptionistRegForm(Model model){
        model.addAttribute("receptionist", new Receptionist());
        return "patient/new";
    }


    @RequestMapping(value = "/receptionist/new", method = RequestMethod.POST)
    public String registerNewReceptionist(Model model, Receptionist receptionist){
        receptionist= receptionistService.save(receptionist);
        model.addAttribute("receptionist", receptionist);
        return "redirect:/receptionist/list";
    }

    @RequestMapping(value = "/receptionist/list", method = RequestMethod.GET)
    public String findAllReceptionist(Model model){
        List<Receptionist> receptionists= receptionistService.findAll();
        model.addAttribute("receptionist", receptionists);
        return "receptionist/list";
    }

    @RequestMapping(value = "/receptionist/delete/{id}", method = RequestMethod.GET)
    public String deleteReceptionistFromList(@PathVariable Long id){
        receptionistService.deleteById(id);
        return "redirect:/receptionist/list";
    }

    @RequestMapping(value = "/receptionist/edit/{id}", method = RequestMethod.GET)
    public String editReceptionist(Model model,@PathVariable Long id){
        Receptionist receptionist= receptionistService.findById(id);
        model.addAttribute("receptionist", receptionist);
        return "patient/edit";
    }

    @RequestMapping(value = "/receptionist/edit", method = RequestMethod.POST)
    public String editedReceptionistData(Receptionist receptionist){
        receptionistService.save(receptionist);
        return "redirect:/receptionist/list";
    }

}
