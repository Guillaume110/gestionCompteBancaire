package com.gestionCompteBancaire.services;

import java.util.List;
import java.util.Optional;

import com.gestionCompteBancaire.entity.CompteCourant;

public interface ICompteCourantService {
	
	List<CompteCourant> findAll();
	Optional<CompteCourant> findOne(Long id);
	CompteCourant saveCompteCourant(CompteCourant compteCourant);
	void deleteCompteCourant(CompteCourant compteCourant);
}
