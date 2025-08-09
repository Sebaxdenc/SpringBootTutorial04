package com.docencia.tutorial01.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("title", "Welcome to Spring Boot");
        model.addAttribute("subtitle", "An Spring Boot Eafit App");
        return "home/index";
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("title", "About Us - Online Store");
        model.addAttribute("subtitle", "About us");
        model.addAttribute("description", "This is an about page ...");
        model.addAttribute("author", "Developed by: Sebastian Medina");
        return "home/about";
    }
    
    @GetMapping("/contact")
    public String contact(Model model) {
        model.addAttribute("title", "Contact Us - Online Store");
        model.addAttribute("subtitle", "Contact us");
        model.addAttribute("description", "This is a contact page ...");
        model.addAttribute("author", "Developed by: Sebastian Medina");
        model.addAttribute("email", "email: contact@onlinestore.com");
        model.addAttribute("phone", "phone: +1234567890");
        model.addAttribute("address", "address: 123 Main St, City, Country");
        return "home/contact";
    }
}