package com.example.demo.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.NonNull;
@Entity
public class Publication {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)

	@NonNull
	private Long id;
	@NonNull
	private String type;
	@NonNull
	private String titre;
	@NonNull
	private String lien;
	@NonNull
	private String sourcepdf;
	@NonNull @Temporal(TemporalType.DATE)
	private Date datePublication;	
}
