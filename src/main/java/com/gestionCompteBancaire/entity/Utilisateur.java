package com.gestionCompteBancaire.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Utilisateur {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUtiisateur;
	private String nomUtilisateur;
	private String prenomUtilisateur;
	@OneToMany(cascade=CascadeType.ALL, mappedBy="utilisateur")
	public List<Compte> comptes;
	
	
	public Long getIdUtiisateur() {
		return idUtiisateur;
	}
	public void setIdUtiisateur(Long idUtiisateur) {
		this.idUtiisateur = idUtiisateur;
	}
	public String getNomUtilisateur() {
		return nomUtilisateur;
	}
	public void setNomUtilisateur(String nomUtilisateur) {
		this.nomUtilisateur = nomUtilisateur;
	}
	public String getPrenomUtilisateur() {
		return prenomUtilisateur;
	}
	public void setPrenomUtilisateur(String prenomUtilisateur) {
		this.prenomUtilisateur = prenomUtilisateur;
	}
	public List<Compte> getComptes() {
		return comptes;
	}
	public void setComptes(List<Compte> comptes) {
		this.comptes = comptes;
	}
	public Utilisateur() {
		super();
	}
	public Utilisateur(Long idUtiisateur, String nomUtilisateur, String prenomUtilisateur, List<Compte> comptes) {
		super();
		this.idUtiisateur = idUtiisateur;
		this.nomUtilisateur = nomUtilisateur;
		this.prenomUtilisateur = prenomUtilisateur;
		this.comptes = comptes;
	}
	@Override
	public String toString() {
		return "Utilisateur [idUtiisateur=" + idUtiisateur + ", nomUtilisateur=" + nomUtilisateur
				+ ", prenomUtilisateur=" + prenomUtilisateur + ", comptes=" + comptes + "]";
	}
	
	 
}
