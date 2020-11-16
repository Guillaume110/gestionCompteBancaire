package com.gestionCompteBancaire.services;

import java.util.List;
import java.util.Optional;

import com.gestionCompteBancaire.entity.CompteEpargne;

public interface ICompteEpargneService {
	
	List<CompteEpargne> findAll();
	Optional<CompteEpargne> findOne(Long id);
	CompteEpargne saveCompteEpargne(CompteEpargne compteEpargne);
	void deleteCompteEpargne(CompteEpargne compteEpargne);
}
