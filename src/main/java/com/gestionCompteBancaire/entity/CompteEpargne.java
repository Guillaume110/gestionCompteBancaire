package com.gestionCompteBancaire.entity;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("epargne")
public class CompteEpargne extends Compte{

	private double taux;

	public double getTaux() {
		return taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}

	public CompteEpargne(Long idCompte, Date dateCreation, double solde, double taux) {
		super(idCompte, dateCreation, solde);
		this.taux = taux;
	}

	public CompteEpargne(Long idCompte, Date dateCreation, double solde) {
		super(idCompte, dateCreation, solde);
	}

	@Override
	public String toString() {
		return "CompteEpargne [taux=" + taux + "]";
	}
	
	
}
