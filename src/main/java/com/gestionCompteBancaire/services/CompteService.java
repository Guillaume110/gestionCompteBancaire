package com.gestionCompteBancaire.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionCompteBancaire.entity.Compte;
import com.gestionCompteBancaire.repositories.CompteRepository;

@Service
public class CompteService implements ICompteService {

	@Autowired
	CompteRepository compteRepo;
	
	@Override
	public List<Compte> findAll() {
		// TODO Auto-generated method stub
		return compteRepo.findAll();
	}

	@Override
	public Optional<Compte> findOne(Long id) {
		// TODO Auto-generated method stub
		return compteRepo.findById(id);
	}

	@Override
	public Compte saveCompte(Compte compte) {
		// TODO Auto-generated method stub
		return compteRepo.save(compte);
	}

	@Override
	public void deleteCompte(Compte compte) {
		// TODO Auto-generated method stub
		compteRepo.delete(compte);
	}

}
