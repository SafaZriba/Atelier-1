package com.example.demo;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
@Entity 

public class Produit {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idProduit;
	private String nomProduit;
	private Double prixProduit;
	private Date dateProduit;
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Produit(String nomProduit, Double prixProduit, Date dateProduit) {
		super();
		this.nomProduit = nomProduit;
		this.prixProduit = prixProduit;
		this.dateProduit = dateProduit;
	}

	public Long getIdProduit() {
		return idProduit;
	}

	public void setIdProduit(Long idProduit) {
		this.idProduit = idProduit;
	}

	public String getNomProduit() {
		return nomProduit;
	}

	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}

	public Double getPrixProduit() {
		return prixProduit;
	}

	public void setPrixProduit(Double prixProduit) {
		this.prixProduit = prixProduit;
	}

	public Date getDateProduit() {
		return dateProduit;
	}

	public void setDateProduit(Date dateProduit) {
		this.dateProduit = dateProduit;
	}
	public String toString() {
		return "Produit [idProduit=" + idProduit + 
				", nomProduit=" + nomProduit + ", prixProduit=" + prixProduit + 
				", dateProduit" + dateProduit + "]";
	}
	@ManyToOne
	private Categorie categorie;
}
