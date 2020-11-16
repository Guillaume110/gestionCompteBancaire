package com.gestionCompteBancaire.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionCompteBancaire.entity.Utilisateur;
import com.gestionCompteBancaire.repositories.UtilisateurRepository;

@Service
public class UtilisateurService implements IUtilisateurService {

	@Autowired
	UtilisateurRepository utilisateurRepo;
	
	@Override
	public List<Utilisateur> findAll() {
		// TODO Auto-generated method stub
		return utilisateurRepo.findAll();
	}

	@Override
	public Optional<Utilisateur> findOne(Long id) {
		// TODO Auto-generated method stub
		return utilisateurRepo.findById(id);
	}

	@Override
	public Utilisateur saveUtilisateur(Utilisateur utilisateur) {
		// TODO Auto-generated method stub
		return utilisateurRepo.save(utilisateur);
	}

	@Override
	public void deleteUtilisateur(Utilisateur utilisateur) {
		// TODO Auto-generated method stub
		utilisateurRepo.delete(utilisateur);
	}

}
