package com.gestionCompteBancaire.services;

import java.util.List;
import java.util.Optional;

import com.gestionCompteBancaire.entity.Utilisateur;


public interface IUtilisateurService {

	List<Utilisateur> findAll();
	Optional<Utilisateur> findOne(Long id);
	Utilisateur saveUtilisateur(Utilisateur utilisateur);
	void deleteUtilisateur(Utilisateur utilisateur);
}
