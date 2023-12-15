package com.example.demo.entities;

import java.util.Collection;
import java.util.Date;

import org.hibernate.annotations.CollectionId;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
@Entity
@Getter @Setter 
@NoArgsConstructor

@DiscriminatorValue("etd")
public class Etudiant extends Member {
	@ManyToOne EnseignantChercheur encadrant ; 
	@OneToMany(mappedBy = "encadrant")
	Collection <Etudiant> listEtudiants ; 
	
	@NonNull
	private String sujet;
	@NonNull
	private String diplome;
	@NonNull @Temporal(TemporalType.DATE)
	private Date dateInscription;	
	@Builder
	public Etudiant(String cin, String nom, String prenom,  Date dateNaissance,
			  String cv, String email, String password,
			 String sujet,  String diplome, Date dateInscription) {
		super(cin, nom, prenom, dateNaissance,cv, email, password);
		this.sujet = sujet;
		this.diplome = diplome;
		this.dateInscription = dateInscription;
	}
	

}
