package com.gestionHopital.gestionHopital.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gestionHopital.gestionHopital.Models.Personne;

@Service
public interface PersonneService {
	
    public Personne savePersonne(Personne personne);

    public Personne updatePersonne(Personne  personne);

    public String deletePersonneById(Long id);

    public String deletePersonneByObject(Personne personne);

    public List<Personne> getAllPersonne();

    public Personne findPersonneById(Long id) ;

    public Personne findPersonneBynom(String nom);


}