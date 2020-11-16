package com.gestionCompteBancaire.entity;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("courant")
public class CompteCourant extends Compte {

	private double decouvert;

	@Override
	public String toString() {
		return "CompteCourant [decouvert=" + decouvert + "]";
	}

	public double getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}

	public CompteCourant(Long idCompte, Date dateCreation, double solde, double decouvert) {
		super(idCompte, dateCreation, solde);
		this.decouvert = decouvert;
	}

	public CompteCourant(Long idCompte, Date dateCreation, double solde) {
		super(idCompte, dateCreation, solde);
	}
	
}
