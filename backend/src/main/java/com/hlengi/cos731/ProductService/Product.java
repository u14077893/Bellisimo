/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hlengi.cos731.ProductService;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import org.springframework.data.annotation.Id;

/**
 *
 * @author hjita
 */
@Entity
@Table(name = "product")
public class Product implements Serializable
{
        private static final long serialVersionUID = -3009157732242241606L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
        @javax.persistence.Id
	private int id;
 
	@Column(name = "name")
	private String prodName;
 
	@Column(name = "description")
	private String prodDescription;
        
        @Column(name = "price")
	private Integer prodPrice;
        
        @Column(name = "image")
	private String prodImage;
 
	protected Product() {
	}
 
	public Product(String prodName, String prodDescription, Integer prodPrice, String prodImage) {
		this.prodName = prodName;
		this.prodDescription = prodDescription;
                this.prodPrice = prodPrice;
                this.prodImage = prodImage;
	}
 
	@Override
	public String toString() {
		return String.format("Product[id=%d, Name='%s', Description='%s', Price= R'%d']", id, prodName, prodDescription, prodPrice);
	}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
