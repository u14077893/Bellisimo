/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hlengi.cos731.bellisimo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Temporal;
import org.springframework.data.annotation.Id;

/**
 *
 * @author hjita
 */
@Entity
@Table(name = "promotion")
public class Promotion implements Serializable
{
        private static final long serialVersionUID = -3009167732242241606L;
	
	@GeneratedValue(strategy = GenerationType.AUTO)
        @Id
        @javax.persistence.Id
	private long promoID;

        @Column(name = "productName")
	private String prodName;
       
	@Column(name = "promotion start")
        @Temporal(javax.persistence.TemporalType.DATE)
	private Date promStart;
        
        @Column(name = "promotion end")
        @Temporal(javax.persistence.TemporalType.DATE)
	private Date promEnd;
        
        @Column(name = "promotion price")
	private Integer discountedPrice;
 
	protected Promotion() {
	}
 
	public Promotion(String prodName, Date promStart, Date promEnd, Integer discountedPrice) {
		this.prodName = prodName;
		this.promStart = promStart;
                this.promEnd = promEnd;
                this.discountedPrice = discountedPrice;
	}
 
	@Override
	public String toString() {
		return String.format("Promotion[id=%d, Product on Special='%s', Promotion Start Date='%s', Promotion End Date= '%s', Promotion Price='%d']", promoID, prodName, promStart, promEnd, discountedPrice);
	}
    
}
