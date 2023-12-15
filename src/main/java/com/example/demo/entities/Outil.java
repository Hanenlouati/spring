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

public class Outil {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)

	@NonNull
	private Long id;
	@NonNull
	private String source;
	@NonNull @Temporal(TemporalType.DATE)
	private Date dateoutil;	
}
