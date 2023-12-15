package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EnseignantRepository;
import com.example.demo.dao.EtudiantRepository;
import com.example.demo.dao.MembreRepository;
import com.example.demo.entities.EnseignantChercheur;
import com.example.demo.entities.Etudiant;
import com.example.demo.entities.Member;

@Service
public class MemberImpl implements IMemberService {
	
	@Autowired
	MembreRepository memberRepository;
	
	@Autowired
	EtudiantRepository etudiantRepository;
	
	@Autowired
	EnseignantRepository enseignantRepository;
	public Member addMember(Member m) {
	memberRepository.save(m);
	return m;
	}
	public void deleteMember(Long id) {
	memberRepository.deleteById(id);
	}
	public Member updateMember(Member m) {
	return memberRepository.saveAndFlush(m);
	}
	public Member findMember(Long id) {
	Member m= (Member)memberRepository.findById(id).get();
	return m;
	}
	
	public List<Member> findAll() {
		return memberRepository.findAll();}
	public Member findByCin(String cin) {
		return memberRepository.findByCin(cin);}
	public Member findByEmail(String email) {
		return memberRepository.findByEmail(email);}
		public List<Member> findByNom(String nom) {
			return memberRepository.findByNom(nom);}
		public List<Etudiant> findByDiplome(String diplome) {
		return etudiantRepository.findByDiplome(diplome);
		}
		public List<EnseignantChercheur> findByGrade(String grade) {
		return enseignantRepository.findByGrade(grade);
		}
		public List<EnseignantChercheur> findByEtablissement(String etablissement) {
			return enseignantRepository.findByEtablissement(etablissement);
	}
		
		
	public void affecterEtudiantToEnseignant(Long id_ens , Long id_etd) {
		
		Etudiant etd=etudiantRepository.findById(id_etd).get();
		EnseignantChercheur ens =enseignantRepository.findById(id_ens).get();
        etd.setEncadrant(ens);
        etudiantRepository.save(etd);
		
	}
	
	public List<Etudiant> findEtudiantByEncadrant( EnseignantChercheur ens){
		
			return findEtudiantByEncadrant(ens);
	}

}

