package com.taobiao.beans;

import java.util.Date;

/**
 * ConsigneeAddress entity. @author MyEclipse Persistence Tools
 */

public class ConsigneeAddress implements java.io.Serializable {

	// Fields

	private Integer id;
	private TUser TUser;
	private String consignee;
	private String province;
	private String city;
	private String district;
	private String address;
	private String postcode;
	private String phone;
	private String cellphone;
	private Date deliverTime;
	private Integer isDefault;

	// Constructors

	/** default constructor */
	public ConsigneeAddress() {
	}

	/** full constructor */
	public ConsigneeAddress(TUser TUser, String consignee, String province,
			String city, String district, String address, String postcode,
			String phone, String cellphone, Date deliverTime, Integer isDefault) {
		this.TUser = TUser;
		this.consignee = consignee;
		this.province = province;
		this.city = city;
		this.district = district;
		this.address = address;
		this.postcode = postcode;
		this.phone = phone;
		this.cellphone = cellphone;
		this.deliverTime = deliverTime;
		this.isDefault = isDefault;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public TUser getTUser() {
		return this.TUser;
	}

	public void setTUser(TUser TUser) {
		this.TUser = TUser;
	}

	public String getConsignee() {
		return this.consignee;
	}

	public void setConsignee(String consignee) {
		this.consignee = consignee;
	}

	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return this.district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPostcode() {
		return this.postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCellphone() {
		return this.cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public Date getDeliverTime() {
		return this.deliverTime;
	}

	public void setDeliverTime(Date deliverTime) {
		this.deliverTime = deliverTime;
	}

	public Integer getIsDefault() {
		return this.isDefault;
	}

	public void setIsDefault(Integer isDefault) {
		this.isDefault = isDefault;
	}

}