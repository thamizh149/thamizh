package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="crickettable")
public class Cricket {
	@Id
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="country")
	private String country;
	public int getId()
	{
		return id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Cricket(String name, String country) {
		super();
		this.name = name;
		this.country = country;
	}
	public Cricket() {
		super();
		// TODO Auto-generated constructor stub
	}
}
