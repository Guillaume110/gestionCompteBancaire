package com.gestionCompteBancaire.controllers;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.gestionCompteBancaire.entity.Utilisateur;
import com.gestionCompteBancaire.services.IUtilisateurService;

@Controller
public class UtilisateurController {

	@Autowired
	IUtilisateurService utilisateurService;
	
	@GetMapping("/utilisateurs")
	public List<Utilisateur> findAll() {
		return utilisateurService.findAll();
	}

	@GetMapping("/utilisateurs/{idUtilisateur}")
	 Optional<Utilisateur> findOne(@PathParam("idUtilisateur") Long id) {
		return utilisateurService.findOne(id);
	}

	@PostMapping("/utilisateurs")
	public Utilisateur saveUtilisateur(@RequestBody Utilisateur utilisateur) {
		return utilisateurService.saveUtilisateur(utilisateur);
	}

	@DeleteMapping("/utilisateurs")
	public void deleteUtilisateur(Utilisateur utilisateur) {
		utilisateurService.deleteUtilisateur(utilisateur);;
	}
}
