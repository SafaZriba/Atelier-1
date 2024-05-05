package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.Produit;
public interface ProduitRepository extends JpaRepository<Produit, Long> {
	List<Produit> findByNomProduit();
	@Query("select p from Produit p where p.nomProduit like %?1 andp.prixProduit > ?2")
	List<Produit> findByNomPrix (String nom, Double prix);

	@Query("select p from Produit p where p.categorie = ?1")
	List<Produit> findByCategorie (Categorie categorie);
	
}
