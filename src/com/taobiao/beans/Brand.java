package com.taobiao.beans;

import java.util.HashSet;
import java.util.Set;

/**
 * Brand entity. @author MyEclipse Persistence Tools
 */

public class Brand implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private String story;
	private String logo;
	private Set serieses = new HashSet(0);
	private Set products = new HashSet(0);

	// Constructors

	/** default constructor */
	public Brand() {
	}

	/** full constructor */
	public Brand(String name, String story, String logo, Set serieses,
			Set products) {
		this.name = name;
		this.story = story;
		this.logo = logo;
		this.serieses = serieses;
		this.products = products;
	}

	// Property accessors

	public Brand(String name, String story, String logo) {
		this.name = name;
		this.story = story;
		this.logo = logo;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStory() {
		return this.story;
	}

	public void setStory(String story) {
		this.story = story;
	}

	public String getLogo() {
		return this.logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public Set getSerieses() {
		return this.serieses;
	}

	public void setSerieses(Set serieses) {
		this.serieses = serieses;
	}

	public Set getProducts() {
		return this.products;
	}

	public void setProducts(Set products) {
		this.products = products;
	}

}