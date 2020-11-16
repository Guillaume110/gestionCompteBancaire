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

import com.gestionCompteBancaire.entity.CompteEpargne;
import com.gestionCompteBancaire.services.ICompteEpargneService;

@RestController
public class CompteEpargneController {

	@Autowired
	ICompteEpargneService compteEpargneService;
	
	@GetMapping("/comptesepargne")
	public List<CompteEpargne> findAll() {
		return compteEpargneService.findAll();
	}

	@GetMapping("/comptesepargne/{idCompteEpargne}")
	public Optional<CompteEpargne> findOne(@PathParam("idCompteEpargne") Long id) {
		return compteEpargneService.findOne(id);
	}

	@PostMapping("/comptesepargne")
	public CompteEpargne saveCompteEpargne(@RequestBody CompteEpargne compteEpargne) {
		return compteEpargneService.saveCompteEpargne(compteEpargne);
	}

	@DeleteMapping("/comptesepargne")
	public void deleteCompteEpargne(CompteEpargne compteEpargne) {
		compteEpargneService.deleteCompteEpargne(compteEpargne);;
	}
}
