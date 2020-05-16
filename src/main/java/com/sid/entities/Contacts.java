package com.sid.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Contacts implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue
	private long id;
	private String nom;
	private String prenom;
	private String tel;
	private String email;
	public Contacts() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Contacts(String nom, String prenom, String tel, String email) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.tel = tel;
		this.email = email;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
