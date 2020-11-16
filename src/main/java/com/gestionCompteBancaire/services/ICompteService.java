package com.gestionCompteBancaire.services;

import java.util.List;
import java.util.Optional;

import com.gestionCompteBancaire.entity.Compte;

public interface ICompteService {
	
	List<Compte> findAll();
	Optional<Compte> findOne(Long id);
	Compte saveCompte(Compte compte);
	void deleteCompte(Compte compte);
}
