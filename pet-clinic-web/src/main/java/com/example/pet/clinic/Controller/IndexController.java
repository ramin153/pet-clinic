package com.example.pet.clinic.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"","/","index","index.html"})
    public String index()
    {
        return "index";
    }

    @RequestMapping("/oups")
    public String oupsHandler(){
        return "NotImplemented";
    }
}
