package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.Evenement;

public interface EvenementService {
	
	//Crud sur les evenements
	public Evenement addEvent(Evenement p);
	public void deleteEvent(Long id) ;
	public Evenement updateEvent(Evenement p) ;
	public Evenement findEvent(Long id) ;
	public List<Evenement> findAll();

	
	//Filtrage par propriété
	Evenement findByTitre(String titre);
	Evenement findByLieu(String lieu);
	
}
