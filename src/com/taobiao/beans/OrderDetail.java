package com.taobiao.beans;

/**
 * OrderDetail entity. @author MyEclipse Persistence Tools
 */

public class OrderDetail implements java.io.Serializable {

	// Fields

	private Long id;
	private Userorder userorder;
	private Product product;
	private String productPic;
	private String productName;
	private Integer productCount;
	private Float productPrice;

	// Constructors

	/** default constructor */
	public OrderDetail() {
	}

	/** full constructor */
	public OrderDetail(Userorder userorder, Product product, String productPic,
			String productName, Integer productCount, Float productPrice) {
		this.userorder = userorder;
		this.product = product;
		this.productPic = productPic;
		this.productName = productName;
		this.productCount = productCount;
		this.productPrice = productPrice;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Userorder getUserorder() {
		return this.userorder;
	}

	public void setUserorder(Userorder userorder) {
		this.userorder = userorder;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public String getProductPic() {
		return this.productPic;
	}

	public void setProductPic(String productPic) {
		this.productPic = productPic;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getProductCount() {
		return this.productCount;
	}

	public void setProductCount(Integer productCount) {
		this.productCount = productCount;
	}

	public Float getProductPrice() {
		return this.productPrice;
	}

	public void setProductPrice(Float productPrice) {
		this.productPrice = productPrice;
	}

}