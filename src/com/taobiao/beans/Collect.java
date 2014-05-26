package com.taobiao.beans;

/**
 * Collect entity. @author MyEclipse Persistence Tools
 */

public class Collect implements java.io.Serializable {

	// Fields

	private Long id;
	private TUser TUser;
	private Product product;
	private String productName;
	private Float productPrice;

	// Constructors

	/** default constructor */
	public Collect() {
	}

	/** full constructor */
	public Collect(TUser TUser, Product product, String productName,
			Float productPrice) {
		this.TUser = TUser;
		this.product = product;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public TUser getTUser() {
		return this.TUser;
	}

	public void setTUser(TUser TUser) {
		this.TUser = TUser;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Float getProductPrice() {
		return this.productPrice;
	}

	public void setProductPrice(Float productPrice) {
		this.productPrice = productPrice;
	}

}