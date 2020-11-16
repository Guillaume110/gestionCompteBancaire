package com.gestionCompteBancaire.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionCompteBancaire.entity.CompteCourant;
import com.gestionCompteBancaire.repositories.CompteCourantRepository;

@Service
public class CompteCourantService implements ICompteCourantService {

	@Autowired
	CompteCourantRepository compteCourantRepo;
	
	@Override
	public List<CompteCourant> findAll() {
		// TODO Auto-generated method stub
		return compteCourantRepo.findAll();
	}

	@Override
	public Optional<CompteCourant> findOne(Long id) {
		// TODO Auto-generated method stub
		return compteCourantRepo.findById(id);
	}

	@Override
	public CompteCourant saveCompteCourant(CompteCourant compteCourant) {
		// TODO Auto-generated method stub
		return compteCourantRepo.save(compteCourant);
	}

	@Override
	public void deleteCompteCourant(CompteCourant compteCourant) {
		// TODO Auto-generated method stub
		compteCourantRepo.delete(compteCourant);
	}

}
