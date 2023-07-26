package com.knkweb.mypetclinicapp.controllers;

import com.knkweb.mypetclinicapp.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping({"/vets","/vets.html"})
@Controller
public class VetController {
    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"","/","/index","/index.html"})
    public String listVets(Model model){
        model.addAttribute("vets",vetService.findAll());
        System.out.println(vetService.findAll());
        System.out.println(vetService.findAll());
        return "vets/index";
    }

}
