/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fstg.Taxecommunale.bean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author alikhyatti
 */
@Entity
public class Commune implements Serializable {

    @OneToMany(mappedBy = "commune")
    private List<Secteur> secteurs;
    @Id
    private long id;
	private String lebelle;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getLebelle() {
		return lebelle;
	}
	public void setLebelle(String lebelle) {
		this.lebelle = lebelle;
	}

 
}
