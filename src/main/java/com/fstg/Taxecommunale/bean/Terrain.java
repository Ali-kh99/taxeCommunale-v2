/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fstg.Taxecommunale.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author alikhyatti
 */
public class Terrain {
    private int id;
	private BigDecimal surface = BigDecimal.ZERO;
	private Proprietaire proprietaire;
	private Categorie categorie;
	private Rue rue;
	private List<TaxeAnnuelle> taxesAnnuelle= new ArrayList<TaxeAnnuelle>();//???????

	

	public Terrain() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rue getRue() {
		return rue;
	}

	public List<TaxeAnnuelle> getTaxesAnnuelle() {
		return taxesAnnuelle;
	}

	public void setTaxesAnnuelle(List<TaxeAnnuelle> taxesAnnuelle) {
		this.taxesAnnuelle = taxesAnnuelle;
	}

	public void setRue(Rue rue) {
		this.rue = rue;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BigDecimal getSurface() {
		return surface;
	}

	public void setSurface(BigDecimal surface) {
		this.surface = surface;
	}

	public Proprietaire getProprietaire() {
		return proprietaire;
	}

	public void setProprietaire(Proprietaire proprietaire) {
		this.proprietaire = proprietaire;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

}
