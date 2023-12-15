package com.example.demo.service;


import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.dao.EvenementRepository;
import com.example.demo.entities.Evenement;

public class EvenementImpl {

	
	@Autowired
	EvenementRepository eventRepository;
	
	public Evenement addEvent(Evenement e) {
		eventRepository.save(e);
		return e;
	}
	public void deleteEvent(Long id) {
		eventRepository.deleteById(id);
	}
	
	public Evenement updatePub(Evenement e) {
		return eventRepository.saveAndFlush(e);
	}
	
	public Evenement findEvent(Long id) {
		Evenement e= (Evenement)eventRepository.findById(id).get();
		return e;
	}
	
	//Filtrage par propriété
	public Evenement findByTitre(String titre) {
		Evenement e= (Evenement)eventRepository.findByTitre(titre);
		return e;
	}
	public Evenement findByLieu(String lieu) {
		Evenement e= (Evenement)eventRepository.findByLieu(lieu);
		return e;
	}


}
