package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController; 

import com.example.demo.entities.Outil;
import com.example.demo.service.OutilService;

@RestController 
public class OutilRestController {

    @Autowired
    OutilService outilService; 

    @PostMapping(value="/outils")
    public Outil addOutil(@RequestBody Outil o) {
        return outilService.addOutil(o);
    }
}
