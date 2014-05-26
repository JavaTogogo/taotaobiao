package com.taobiao.beans;

import java.util.HashSet;
import java.util.Set;

/**
 * Series entity. @author MyEclipse Persistence Tools
 */

public class Series implements java.io.Serializable {

	// Fields

	private Integer id;
	private Brand brand;
	private String name;
	private String description;
	private Set products = new HashSet(0);

	// Constructors

	/** default constructor */
	public Series() {
	}

	public Series(Brand brand, String name, String description) {
		super();
		this.brand = brand;
		this.name = name;
		this.description = description;
	}

	/** full constructor */
	public Series(Brand brand, String name, String description, Set products) {
		this.brand = brand;
		this.name = name;
		this.description = description;
		this.products = products;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Brand getBrand() {
		return this.brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set getProducts() {
		return this.products;
	}

	public void setProducts(Set products) {
		this.products = products;
	}

}