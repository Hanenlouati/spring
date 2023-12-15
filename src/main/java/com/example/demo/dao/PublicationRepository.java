package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Publication;

public interface PublicationRepository extends JpaRepository<Publication,Long>{

	Publication findByTitre(String titre);
	List<Publication> findByType(String type);
	Publication findByLien(String lien);


}
