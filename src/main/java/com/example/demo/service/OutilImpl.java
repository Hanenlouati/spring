package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.OutilRepository;
import com.example.demo.entities.Outil;

@Service
public class OutilImpl implements OutilService  {

	@Autowired
	OutilRepository outilRepository;
	
	public Outil addOutil(Outil o) {
		outilRepository.save(o);
		return o;
	}
	public void deleteOutil(Long id) {
		outilRepository.deleteById(id);
	}
	
	public Outil updateOutil(Outil o) {
		return outilRepository.saveAndFlush(o);
	}
	
	public Outil findOutil(Long id) {
		Outil o= (Outil)outilRepository.findById(id).get();
		return o;
	}
	

	@Override
	public List<Outil> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Outil findBySource(String source) {
		Outil o= (Outil)outilRepository.findBySource(source);
		return o;
	}
	


}
