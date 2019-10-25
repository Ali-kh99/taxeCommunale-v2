/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fstg.Taxecommunale.bean;
import java.math.BigDecimal;
import java.util.Date;
/**
 *
 * @author alikhyatti
 */
public class TaxeAnnuelle {
    private int id;
	private int annee;
//	private TauxRetardTaxe tauxRetardTaxe;
	private BigDecimal totalTaxe;
	private Proprietaire proprietaire;
	private Terrain terrain;
	private Date datePaiment;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}


	public BigDecimal getTotalTaxe() {
		return totalTaxe;
	}

	public void setTotalTaxe(BigDecimal totalTaxe) {
		this.totalTaxe = totalTaxe;
	}
}
