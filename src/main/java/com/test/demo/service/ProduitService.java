package com.test.demo.service;

import java.util.List;

import com.test.demo.model.Produit;

public interface ProduitService {

	Produit creer(Produit produit);
    
	List<Produit> lire();
	
	Produit modifier(Long id, Produit produit);
	
	String supprimer(Long id);
	
}
