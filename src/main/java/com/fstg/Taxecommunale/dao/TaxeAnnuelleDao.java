/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fstg.Taxecommunale.dao;

import com.fstg.Taxecommunale.bean.TaxeAnnuelle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author alikhyatti
 */
@Repository
public interface TaxeAnnuelleDao extends JpaRepository<TaxeAnnuelle, Long>{
    
}
