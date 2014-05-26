package com.taobiao.beans;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Product entity. @author MyEclipse Persistence Tools
 */

public class Product implements java.io.Serializable {

	// Fields

	private Integer id;
	private Brand brand;
	private Series series;
	private String productName;
	private String location;
	private String brand_1;
	private String series_1;
	private String model;
	private String style;
	private String size;
	private String thickness;
	private String mechanism;
	private String mechanismType;
	private String watchcase;
	private String dial;
	private String face;
	private String watchband;
	private String waterproof;
	private String function;
	private String pack;
	private Float price;
	private Float specialPrice;
	private Timestamp topCarriageTime;
	private Long popularity;
	private Integer sales;
	private String remark;
	private String pic;
	private Set pictures = new HashSet(0);
	private Set orderDetails = new HashSet(0);
	private Set collects = new HashSet(0);

	// Constructors

	/** default constructor */
	public Product() {
	}

	/** minimal constructor */
	public Product(Timestamp topCarriageTime) {
		this.topCarriageTime = topCarriageTime;
	}

	/** full constructor */
	public Product(Brand brand, Series series, String productName,
			String location, String brand_1, String series_1, String model,
			String style, String size, String thickness, String mechanism,
			String mechanismType, String watchcase, String dial, String face,
			String watchband, String waterproof, String function, String pack,
			Float price, Float specialPrice, Timestamp topCarriageTime,
			Long popularity, Integer sales, String remark, String pic,
			Set pictures, Set orderDetails, Set collects) {
		this.brand = brand;
		this.series = series;
		this.productName = productName;
		this.location = location;
		this.brand_1 = brand_1;
		this.series_1 = series_1;
		this.model = model;
		this.style = style;
		this.size = size;
		this.thickness = thickness;
		this.mechanism = mechanism;
		this.mechanismType = mechanismType;
		this.watchcase = watchcase;
		this.dial = dial;
		this.face = face;
		this.watchband = watchband;
		this.waterproof = waterproof;
		this.function = function;
		this.pack = pack;
		this.price = price;
		this.specialPrice = specialPrice;
		this.topCarriageTime = topCarriageTime;
		this.popularity = popularity;
		this.sales = sales;
		this.remark = remark;
		this.pic = pic;
		this.pictures = pictures;
		this.orderDetails = orderDetails;
		this.collects = collects;
	}

	// Property accessors

	public Product(Brand brand, Series series, String productName,
			String location, String brand_1, String series_1, String model,
			String style, String size, String thickness, String mechanism,
			String mechanismType, String watchcase, String dial, String face,
			String watchband, String waterproof, String function, String pack,
			Float price, Float specialPrice, Timestamp topCarriageTime,
			Long popularity, Integer sales, String remark, String pic) {
		super();
		this.brand = brand;
		this.series = series;
		this.productName = productName;
		this.location = location;
		this.brand_1 = brand_1;
		this.series_1 = series_1;
		this.model = model;
		this.style = style;
		this.size = size;
		this.thickness = thickness;
		this.mechanism = mechanism;
		this.mechanismType = mechanismType;
		this.watchcase = watchcase;
		this.dial = dial;
		this.face = face;
		this.watchband = watchband;
		this.waterproof = waterproof;
		this.function = function;
		this.pack = pack;
		this.price = price;
		this.specialPrice = specialPrice;
		this.topCarriageTime = topCarriageTime;
		this.popularity = popularity;
		this.sales = sales;
		this.remark = remark;
		this.pic = pic;
	}

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

	public Series getSeries() {
		return this.series;
	}

	public void setSeries(Series series) {
		this.series = series;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getBrand_1() {
		return this.brand_1;
	}

	public void setBrand_1(String brand_1) {
		this.brand_1 = brand_1;
	}

	public String getSeries_1() {
		return this.series_1;
	}

	public void setSeries_1(String series_1) {
		this.series_1 = series_1;
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getStyle() {
		return this.style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getSize() {
		return this.size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getThickness() {
		return this.thickness;
	}

	public void setThickness(String thickness) {
		this.thickness = thickness;
	}

	public String getMechanism() {
		return this.mechanism;
	}

	public void setMechanism(String mechanism) {
		this.mechanism = mechanism;
	}

	public String getMechanismType() {
		return this.mechanismType;
	}

	public void setMechanismType(String mechanismType) {
		this.mechanismType = mechanismType;
	}

	public String getWatchcase() {
		return this.watchcase;
	}

	public void setWatchcase(String watchcase) {
		this.watchcase = watchcase;
	}

	public String getDial() {
		return this.dial;
	}

	public void setDial(String dial) {
		this.dial = dial;
	}

	public String getFace() {
		return this.face;
	}

	public void setFace(String face) {
		this.face = face;
	}

	public String getWatchband() {
		return this.watchband;
	}

	public void setWatchband(String watchband) {
		this.watchband = watchband;
	}

	public String getWaterproof() {
		return this.waterproof;
	}

	public void setWaterproof(String waterproof) {
		this.waterproof = waterproof;
	}

	public String getFunction() {
		return this.function;
	}

	public void setFunction(String function) {
		this.function = function;
	}

	public String getPack() {
		return this.pack;
	}

	public void setPack(String pack) {
		this.pack = pack;
	}

	public Float getPrice() {
		return this.price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Float getSpecialPrice() {
		return this.specialPrice;
	}

	public void setSpecialPrice(Float specialPrice) {
		this.specialPrice = specialPrice;
	}

	public Timestamp getTopCarriageTime() {
		return this.topCarriageTime;
	}

	public void setTopCarriageTime(Timestamp topCarriageTime) {
		this.topCarriageTime = topCarriageTime;
	}

	public Long getPopularity() {
		return this.popularity;
	}

	public void setPopularity(Long popularity) {
		this.popularity = popularity;
	}

	public Integer getSales() {
		return this.sales;
	}

	public void setSales(Integer sales) {
		this.sales = sales;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getPic() {
		return this.pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public Set getPictures() {
		return this.pictures;
	}

	public void setPictures(Set pictures) {
		this.pictures = pictures;
	}

	public Set getOrderDetails() {
		return this.orderDetails;
	}

	public void setOrderDetails(Set orderDetails) {
		this.orderDetails = orderDetails;
	}

	public Set getCollects() {
		return this.collects;
	}

	public void setCollects(Set collects) {
		this.collects = collects;
	}

}