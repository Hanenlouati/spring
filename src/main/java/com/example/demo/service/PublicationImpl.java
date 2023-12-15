package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.dao.PublicationRepository;
import com.example.demo.entities.Publication;

public class PublicationImpl {

	
	@Autowired
	PublicationRepository pubRepository;
	
	public Publication addPub(Publication p) {
		pubRepository.save(p);
		return p;
	}
	public void deletePub(Long id) {
		pubRepository.deleteById(id);
	}
	
	public Publication updatePub(Publication p) {
		return pubRepository.saveAndFlush(p);
	}
	
	public Publication findPub(Long id) {
		Publication p= (Publication)pubRepository.findById(id).get();
		return p;
	}
	
	
	public Publication findByTitre(String titre) {
		Publication p= (Publication)pubRepository.findByTitre(titre);
		return p;
	}

	
	public List<Publication> findByType(String type){
		return pubRepository.findByType(type);
		
	}
	public Publication findByLien(String lien){
		Publication p= (Publication)pubRepository.findByLien(lien);
		return p;
	}
}
