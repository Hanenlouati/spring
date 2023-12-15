package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Member;
import com.example.demo.entities.Outil;


public interface OutilRepository extends JpaRepository<Outil,Long>{
	
	Outil findBySource(String source);

	
}
