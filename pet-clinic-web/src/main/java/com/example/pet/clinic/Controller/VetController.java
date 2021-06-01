package com.example.pet.clinic.Controller;

import com.example.pet.clinic.service.map.VetServiceMap;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {
    private final VetServiceMap vetServiceMap;

    public VetController(VetServiceMap vetServiceMap) {
        this.vetServiceMap = vetServiceMap;
    }

    @RequestMapping({"/vet","/vet/","/vet/index","/vet/index.html"})
    public String listVets(Model model)
    {
        model.addAttribute("vets",vetServiceMap.findAll());
        return "vet/index";
    }

}