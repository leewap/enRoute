package com.enRoute.enRoute.controllers;

import com.enRoute.enRoute.repositories.DeliverRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DeliverController {
    private DeliverRepository deliverRepository;

    public DeliverController(DeliverRepository deliverRepository){
        this.deliverRepository = deliverRepository;
    }

    @RequestMapping("/delivers")
    public String getDelivers(Model model) {

        model.addAttribute("delivers", deliverRepository.findAll());

        return "delivers";
    }
}
