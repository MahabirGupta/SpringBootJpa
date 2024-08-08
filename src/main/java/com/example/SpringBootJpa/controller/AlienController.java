package com.example.SpringBootJpa.controller;

import com.example.SpringBootJpa.dao.AlienRepository;
import com.example.SpringBootJpa.model.Alien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AlienController {

    @Autowired
    AlienRepository alienRepository; // AlienRepository is an interface not a class

    @RequestMapping("home") //name of the jsp file
    public String getHomePage(){
        System.out.println("Hi");
        return "home"; //don't add.jsp
    }
    @RequestMapping("addAlien")
    public String addAlien(Alien alien){
        alienRepository.save(alien);
        return "home";
    }
}
