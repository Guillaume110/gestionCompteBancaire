package com.gestionCompteBancaire.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestionCompteBancaire.entity.Compte;

@Repository
public interface CompteRepository extends JpaRepository<Compte, Long> {

}
