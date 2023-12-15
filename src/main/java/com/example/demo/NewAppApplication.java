package com.example.demo;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.EnseignantRepository;
import com.example.demo.dao.EtudiantRepository;
import com.example.demo.dao.MembreRepository;
import com.example.demo.entities.EnseignantChercheur;
import com.example.demo.entities.Etudiant;
import com.example.demo.entities.Member;
import com.example.demo.entities.Outil;
import com.example.demo.service.IMemberService;
import com.example.demo.service.MemberImpl;

import lombok.AllArgsConstructor;
import lombok.Builder;

@SpringBootApplication
@AllArgsConstructor
public class NewAppApplication implements CommandLineRunner{

EtudiantRepository etudiantRepository;
MembreRepository memberRepository;
EnseignantRepository enseignantRepository;
IMemberService memberService ;

	public static void main(String[] args) {
		SpringApplication.run(NewAppApplication.class, args);
		
	
	}

	@Override
	public void run(String... args) throws Exception {
		
		Etudiant etd1=Etudiant.builder().cin("123456")
				.dateInscription(new Date()).dateNaissance(new Date())
				.diplome("mastère")
				.email("etd1@gmail.com")
				.password("pass1")
				.cv("cv1")
				.nom("abid")
				.prenom("tarak")
				.sujet("blockhain")
				.build();
	        memberRepository.save(etd1);
	        
	        
	    	Etudiant etd2=Etudiant.builder().cin("1234567")
					.dateInscription(new Date()).dateNaissance(new Date())
					.diplome("mastère")
					.email("etd2@gmail.com")
					.password("pass1")
					.cv("cv2")
					.nom("mseddi")
					.prenom("Wiem")
					.sujet("SpringBoot")
				
					.build();
		        memberRepository.save(etd2);

		       EnseignantChercheur ens1=EnseignantChercheur.builder().cin("12345678")
						.dateNaissance(new Date()).dateNaissance(new Date())

					.email("ens1@gmail.com")
					.password("pass3")
					.cv("cv3")
					.nom("mseddi")
					.prenom("loulou")
					.grade("Professeur")
					.etablissement("ENIS")
					.build();
		        memberRepository.save(ens1);
		        
		        EnseignantChercheur ens2=EnseignantChercheur.builder().cin("1234577")
						.dateNaissance(new Date()).dateNaissance(new Date())
						.email("ens2@gmail.com")
						.password("pass4")
						.cv("cv4")
						.nom("mseddi")
						.prenom("wiwi")
						.grade("Professeur")
						.etablissement("ENIS")
						.build();
			        memberRepository.save(ens2); 

			       
			
			
			Member m= memberService.findMember(1L);
			m.setCv("cv1.pdf");
			memberService.updateMember(m);
			// Delete a Member
			memberService.deleteMember(2L);
			
			
			
			memberService.affecterEtudiantToEnseignant(ens2.getId(), etd1.getId());

			
	
	}

}
