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

import com.gestionCompteBancaire.entity.CompteCourant;
import com.gestionCompteBancaire.services.ICompteCourantService;

@RestController
public class CompteCourantController {

	@Autowired
	ICompteCourantService compteCourantService;
	
	@GetMapping("/comptescourant")
	public List<CompteCourant> findAll() {
		return compteCourantService.findAll();
	}

	@GetMapping("/comptescourant/{idCompteCourant}")
	public Optional<CompteCourant> findOne(@PathParam("idCompteCourant") Long id) {
		return compteCourantService.findOne(id);
	}

	@PostMapping("/comptescourant")
	public CompteCourant saveCompteCourant(@RequestBody CompteCourant compteCourant) {
		return compteCourantService.saveCompteCourant(compteCourant);
	}

	@DeleteMapping("/comptescourant")
	public void deleteCompteCourant(CompteCourant compteCourant) {
		compteCourantService.deleteCompteCourant(compteCourant);
	}
}
