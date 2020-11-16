package com.gestionCompteBancaire.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestionCompteBancaire.entity.CompteCourant;

@Repository
public interface CompteCourantRepository extends JpaRepository<CompteCourant, Long> {

}
