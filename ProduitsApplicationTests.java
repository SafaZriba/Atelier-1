package com.example.demo;



import java.sql.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProduitsApplicationTests {
@Autowired
private ProduitRepository produitRepository;
@Test
public void testCreateProduit() {
@SuppressWarnings("deprecation")
Produit prod = new Produit("PC Dell",2200.500,new Date(0, 0, 0));
produitRepository.save(prod);
}
@Test
public void testFindProduit()
{
Produit p = produitRepository.findById(1L).get();
System.out.println(p);
}
@Test
public void testUpdateProduit()
{
Produit p = produitRepository.findById(1L).get();
p.setPrixProduit(1000.0);
produitRepository.save(p);
}
@Test
public void testFindByNomProduit()
{
List<Produit> prods = produitRepository.findByNomProduit();
for (Produit p : prods)
{
	System.out.println(p);
}
}
@Test
public void testfindByNomPrix()
{
List<Produit> prods = produitRepository.findByNomPrix("dell",1000.0);
for (Produit p : prods)
{
System.out.println(p);
}
}
@Test
public void testfindByCategorie()
{
Categorie cat = new Categorie();
cat.setIdCat(1L); //afficher les produits de catégorie 1
List<Produit> prods = produitRepository.findByCategorie(cat);
for (Produit p : prods)
{
System.out.println(p);
}
}
}
