/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fstg.Taxecommunale.bean;
import java.math.BigDecimal;

/**
 *
 * @author alikhyatti
 */
public class TauxTaxe {
    private int id;
	private Categorie categorie;
	private BigDecimal taxe;

	
	public TauxTaxe() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Categorie getC() {
		return categorie;
	}

	public void setC(Categorie categorie) {
		this.categorie = categorie;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	public BigDecimal getTaxe() {
		return taxe;
	}

	public void setTaxe(BigDecimal taxe) {
		this.taxe = taxe;
	}
}
