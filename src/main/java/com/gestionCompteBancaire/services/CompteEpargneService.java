package com.gestionCompteBancaire.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionCompteBancaire.entity.CompteEpargne;
import com.gestionCompteBancaire.repositories.CompteEpargneRepository;

@Service
public class CompteEpargneService implements ICompteEpargneService {

	@Autowired
	CompteEpargneRepository compteEpargneRepo;
	
	@Override
	public List<CompteEpargne> findAll() {
		// TODO Auto-generated method stub
		return compteEpargneRepo.findAll();
	}

	@Override
	public Optional<CompteEpargne> findOne(Long id) {
		// TODO Auto-generated method stub
		return compteEpargneRepo.findById(id);
	}

	@Override
	public CompteEpargne saveCompteEpargne(CompteEpargne compteEpargne) {
		// TODO Auto-generated method stub
		return compteEpargneRepo.save(compteEpargne);
	}

	@Override
	public void deleteCompteEpargne(CompteEpargne compteEpargne) {
		// TODO Auto-generated method stub
		compteEpargneRepo.delete(compteEpargne);
	}

}
