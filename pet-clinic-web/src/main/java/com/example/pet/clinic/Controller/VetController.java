package com.example.pet.clinic.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    @RequestMapping({"/vet","/vet/","/vet/index","/vet/index.html"})
    public String listVets()
    {
        return "vet/index";
    }

}
