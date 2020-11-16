package com.gestionCompteBancaire.controllers;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gestionCompteBancaire.entity.Compte;
import com.gestionCompteBancaire.services.ICompteService;

@RestController
public class CompteController {

	@Autowired
	ICompteService compteService;
	
	@GetMapping("/comptes")
	public List<Compte> findAll() {
		return compteService.findAll();
	}

	@GetMapping("/comptes/{idCompte}")
	public Optional<Compte> findOne(@PathParam("idCompte") Long id) {
		return compteService.findOne(id);
	}

	@PostMapping("/comptes")
	public Compte saveCompte(@RequestBody Compte compte) {
		return compteService.saveCompte(compte);
	}

	@DeleteMapping("/comptes")
	public void deleteCompte(Compte compte) {
		compteService.deleteCompte(compte);;
	}
}
