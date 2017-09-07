/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hlengi.cos731.bellisimo;

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
@Table(name = "users")
public class User implements Serializable
{
    private static final long serialVersionUID = -3009157832242241606L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
        @javax.persistence.Id
	private long id;
 
	@Column(name = "email")
	private String email;
 
	@Column(name = "password")
	private String password;
        
	protected User() {
	}
        
        public String getEmail()
        {
            return email;
        }
        
        public String getPassword()
        {
            return password;
        }
 
	public User(String email, String password) {
		this.email = email;
		this.password = password;
	}
 
	@Override
	public String toString() {
		return String.format("Administrator[id=%d, Email='%s']", id, email);
	}
}
