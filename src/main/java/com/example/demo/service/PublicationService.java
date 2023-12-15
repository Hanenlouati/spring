package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.EnseignantChercheur;
import com.example.demo.entities.Etudiant;
import com.example.demo.entities.Member;
import com.example.demo.entities.Publication;

public interface PublicationService {

	
	//Crud sur les publications
	public Publication addPub(Publication p);
	public void deletePub(Long id) ;
	public Publication updatePub(Publication p) ;
	public Publication findPub(Long id) ;
	public List<Publication> findAll();

	
	//Filtrage par propriété
	Publication findByTitre(String titre);
	List <Publication> findByType(String type);
	Publication findByLien(String lien);
	


}
